package com.ac.signUp.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Entity-Details")
public class RegistrationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String entityName;
	private byte[] logo;
	private String Address;
	private String Village;
	private String Mandel;
	private String District;
	private String City;
	private int Pincode;
    private String State;
    private String Country;
    
    private long Mobile;
    private String email;
    private String password;
    private String Website;
    
    private String Youtube;
    private String Instagram;
    private String FB;
    private String Twitter;
    
    private String AboutChruch;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getVillage() {
		return Village;
	}

	public void setVillage(String village) {
		Village = village;
	}

	public String getMandel() {
		return Mandel;
	}

	public void setMandel(String mandel) {
		Mandel = mandel;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		Mobile = mobile;
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

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getYoutube() {
		return Youtube;
	}

	public void setYoutube(String youtube) {
		Youtube = youtube;
	}

	public String getInstagram() {
		return Instagram;
	}

	public void setInstagram(String instagram) {
		Instagram = instagram;
	}

	public String getFB() {
		return FB;
	}

	public void setFB(String fB) {
		FB = fB;
	}

	public String getTwitter() {
		return Twitter;
	}

	public void setTwitter(String twitter) {
		Twitter = twitter;
	}

	public String getAboutChruch() {
		return AboutChruch;
	}

	public void setAboutChruch(String aboutChruch) {
		AboutChruch = aboutChruch;
	}

	public RegistrationEntity(long id, String entityName, byte[] logo, String address, String village, String mandel,
			String district, String city, int pincode, String state, String country, long mobile, String email,
			String password, String website, String youtube, String instagram, String fB, String twitter,
			String aboutChruch) {
		super();
		this.id = id;
		this.entityName = entityName;
		this.logo = logo;
		Address = address;
		Village = village;
		Mandel = mandel;
		District = district;
		City = city;
		Pincode = pincode;
		State = state;
		Country = country;
		Mobile = mobile;
		this.email = email;
		this.password = password;
		Website = website;
		Youtube = youtube;
		Instagram = instagram;
		FB = fB;
		Twitter = twitter;
		AboutChruch = aboutChruch;
	}

	public RegistrationEntity() {
		super();
	}

	@Override
	public String toString() {
		return "RegistrationEntity [id=" + id + ", entityName=" + entityName + ", logo=" + Arrays.toString(logo)
				+ ", Address=" + Address + ", Village=" + Village + ", Mandel=" + Mandel + ", District=" + District
				+ ", City=" + City + ", Pincode=" + Pincode + ", State=" + State + ", Country=" + Country + ", Mobile="
				+ Mobile + ", email=" + email + ", password=" + password + ", Website=" + Website + ", Youtube="
				+ Youtube + ", Instagram=" + Instagram + ", FB=" + FB + ", Twitter=" + Twitter + ", AboutChruch="
				+ AboutChruch + "]";
	}

	
    

}