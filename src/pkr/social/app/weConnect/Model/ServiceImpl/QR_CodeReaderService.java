package pkr.social.app.weConnect.Model.ServiceImpl;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;

@Service
public class QR_CodeReaderService {

	

	public  Map<String, String> getAadhaarDetails(String _aadhaarFileName) throws Exception {

		InputStream inputStream = new FileInputStream("F:\\we-conect-data-store\\wc-aadhar-store\\" + _aadhaarFileName);
		BufferedImage qrcodeImage = ImageIO.read(inputStream);
		Map<String, String> _aadharKeyMap = new HashMap<String, String>();
		String _refinedData = readQRCode(qrcodeImage);
		DocumentBuilderFactory _dbf = DocumentBuilderFactory.newInstance();
		_dbf.setValidating(false);
		DocumentBuilder _db = _dbf.newDocumentBuilder();
		Document _doc = _db.parse(new ByteArrayInputStream(_refinedData.getBytes("utf-8")));
		NodeList nlRecords = _doc.getElementsByTagName("PrintLetterBarcodeData");
		int _numOfRecords = nlRecords.getLength();
		for (int i = 0; i < _numOfRecords; i++) {
			Element node = (Element) nlRecords.item(i);
			NamedNodeMap attributes = node.getAttributes();
			int numAttrs = attributes.getLength();
			for (int j = 0; j < numAttrs; j++) {
				Attr attr = (Attr) attributes.item(j);
				_aadharKeyMap.put(attr.getNodeName(), attr.getNodeValue());
			}

		}

		return _aadharKeyMap;
	}

	private static String readQRCode(BufferedImage qrcodeImage) throws Exception {
		Hashtable<DecodeHintType, Object> _hintMap = new Hashtable<DecodeHintType, Object>();
		_hintMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
		BufferedImageLuminanceSource _source = new BufferedImageLuminanceSource(qrcodeImage);
		BinaryBitmap _bitmap = new BinaryBitmap(new HybridBinarizer(_source));
		QRCodeReader _reader = new QRCodeReader();
		com.google.zxing.Result _rawResult;
		_rawResult = _reader.decode(_bitmap, _hintMap);
		String _refinedResult = _rawResult.getText()
				.substring(_rawResult.getText().indexOf("PrintLetterBarcodeData") - 1);

		return _refinedResult;
	}

}
