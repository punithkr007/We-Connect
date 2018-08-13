package pkr.social.app.weConnect.test.QR_Code;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;

public class Reader {

	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

		/*
		 * InputStream inputStream = new FileInputStream(
		 * "C:\\Users\\Punithkr\\Desktop\\Desk\\DEMO_SAMPLES\\Sanjay docs\\aadhaar.jpg"
		 * );
		 */
		InputStream inputStream = new FileInputStream(
				"C:\\Users\\Punithkr\\Desktop\\Desk\\DEMO_SAMPLES\\Sanjay docs\\aadhaar.jpg");

		BufferedImage qrcodeImage = ImageIO.read(inputStream);

		Hashtable<DecodeHintType, Object> hintMap = new Hashtable<DecodeHintType, Object>();
		hintMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);

		BufferedImageLuminanceSource source = new BufferedImageLuminanceSource(qrcodeImage);
		BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

		QRCodeReader reader = new QRCodeReader();
		com.google.zxing.Result result;
		try {
			result = reader.decode(bitmap, hintMap);
			String actualResult = result.getText();
			String modifiedResult = result.getText().substring(actualResult.indexOf("PrintLetterBarcodeData") - 1);
			System.out.println(modifiedResult);

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(false);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new ByteArrayInputStream(modifiedResult.getBytes("utf-8")));
			NodeList nlRecords = doc.getElementsByTagName("PrintLetterBarcodeData");
			int num = nlRecords.getLength();
			for (int i = 0; i < num; i++) {
				Element node = (Element) nlRecords.item(i);

				System.out.println("List attributes for node: " + node.getNodeName());

				NamedNodeMap attributes = node.getAttributes();

				int numAttrs = attributes.getLength();

				for (int j = 0; j < numAttrs; j++) {
					Attr attr = (Attr) attributes.item(j);

					String attrName = attr.getNodeName();
					String attrValue = attr.getNodeValue();

					System.out.println("Found attribute: " + attrName + " with value: " + attrValue);

				}

			}

		} catch (NotFoundException e) {
			e.printStackTrace();
		} catch (ChecksumException e) {
			e.printStackTrace();
		} catch (FormatException e) {
			e.printStackTrace();
		}

	}
}
