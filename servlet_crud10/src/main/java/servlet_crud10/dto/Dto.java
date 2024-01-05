package servlet_crud10.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dto {
	@Id
	private int id;
	private String name;
	private String dob;
	private String email;
	private long phone;
	private String gender;
	private String country;
	private String checkbox;
	@Override
	public String toString() {
		return "Dto [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + ", country=" + country + ", checkbox=" + checkbox + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getDob()=" + getDob() + ", getEmail()=" + getEmail() + ", getPhone()="
				+ getPhone() + ", getGender()=" + getGender() + ", getCountry()=" + getCountry() + ", getCheckbox()="
				+ getCheckbox() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	

}
