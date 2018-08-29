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
	private String name;
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
	private String house;
	@Column(name = "wc_street")
	private String street;
	@Column(name = "wc_lm")
	private String lm;
	@Column(name = "wc_loction")
	private String loc;
	@Column(name = "wc_vtc")
	private String vtc;
	@Column(name = "wc_po")
	private String po;
	@Column(name = "wc_district")
	private String dist;
	@Column(name = "wc_subDistrict")
	private String subdist;
	@Column(name = "wc_state")
	private String state;
	@Column(name = "wc_postalCode")
	private String pc;
	@Column(name = "wc_dateOfBirth")
	private String dob;
	@Column(name = "wc_co")
	private String co;
	@Column(name = "wc_yob")
	private String yob;

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

	public String getName() {
		return name;
	}

	public void setName(String userName) {
		this.name = userName;
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

	public String getHouse() {
		return house;
	}

	public void setHouse(String houseNo) {
		this.house = houseNo;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loction) {
		this.loc = loction;
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
	

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getSubdist() {
		return subdist;
	}

	public void setSubdist(String subdist) {
		this.subdist = subdist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String postalCode) {
		this.pc = postalCode;
	}

	

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getYob() {
		return yob;
	}

	public void setYob(String yob) {
		this.yob = yob;
	}

	@Override
	public String toString() {
		return "wc_UserEntity [id=" + id + ", uid=" + uid + ", userName=" + name + ", email=" + email
				+ ", password=" + password + ", age=" + age + ", phoneNumber=" + phoneNumber + ", gender=" + gender
				+ ", houseNo=" + house + ", street=" + street + ", lm=" + lm + ", loction=" + loc + ", vtc=" + vtc
				+ ", po=" + po + ", district=" + dist + ", subDistrict=" + subdist + ", state=" + state
				+ ", postalCode=" + pc + ", dateOfBirth=" + dob + ", co=" + co + "]";
	}

	
}
