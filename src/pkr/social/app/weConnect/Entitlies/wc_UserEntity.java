package pkr.social.app.weConnect.Entitlies;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "wc_user_basic_info")
public class wc_UserEntity {

	@Id
	@GenericGenerator(name = "userId", strategy = "increment")
	@GeneratedValue(generator = "userId")
	@Column(name = "id")
	private int id;
	@Column(name = "wc_uid")
	private String uid;
	@Column(name = "wc_userName")
	private String userName;
	@Column(name = "wc_email")
	private String email;
	@Column(name = "wc_password")
	private String password;
	@Column(name = "wc_age")
	private String age;
	@Column(name = "wc_phoneNumber")
	private String phoneNumber;
	@Column(name = "wc_gender")
	private String gender;
	@Column(name = "wc_houseNo")
	private String houseNo;
	@Column(name = "wc_street")
	private String street;
	@Column(name = "wc_lm")
	private String lm;
	@Column(name = "wc_loction")
	private String loction;
	@Column(name = "wc_vtc")
	private String vtc;
	@Column(name = "wc_po")
	private String po;
	@Column(name = "wc_district")
	private String district;
	@Column(name = "wc_subDistrict")
	private String subDistrict;
	@Column(name = "wc_state")
	private String state;
	@Column(name = "wc_postalCode")
	private String postalCode;
	@Column(name = "wc_dateOfBirth")
	private String dateOfBirth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLm() {
		return lm;
	}

	public void setLm(String lm) {
		this.lm = lm;
	}

	public String getLoction() {
		return loction;
	}

	public void setLoction(String loction) {
		this.loction = loction;
	}

	public String getVtc() {
		return vtc;
	}

	public void setVtc(String vtc) {
		this.vtc = vtc;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSubDistrict() {
		return subDistrict;
	}

	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
