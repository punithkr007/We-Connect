package pkr.social.app.weConnect.Entitlies;

import java.io.Serializable;

public class AadharEntity implements Serializable{

	private String co;
	private String dist;
	private String dob;
	private String gender;
	private String house;
	private String loc;
	private String name;
	private String pc;
	private String po;
	private String state;
	private String street;
	private String subdist;
	private String uid;
	private String vtc;
	private String yob;

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	public void setHouse(String house) {
		this.house = house;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSubDist() {
		return subdist;
	}

	public void setSubDist(String subdist) {
		this.subdist = subdist;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getVtc() {
		return vtc;
	}

	public void setVtc(String vtc) {
		this.vtc = vtc;
	}

	public String getYob() {
		return yob;
	}

	public void setYob(String yob) {
		this.yob = yob;
	}

	@Override
	public String toString() {
		return "AadharEntity [co=" + co + ", dist=" + dist + ", dob=" + dob + ", gender=" + gender + ", house=" + house
				+ ", loc=" + loc + ", name=" + name + ", pc=" + pc + ", po=" + po + ", state=" + state + ", street="
				+ street + ", subdist=" + subdist + ", uid=" + uid + ", vtc=" + vtc + ", yob=" + yob + "]";
	}

	
	
}
