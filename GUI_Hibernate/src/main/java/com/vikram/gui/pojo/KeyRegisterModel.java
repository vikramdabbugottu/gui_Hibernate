package com.vikram.gui.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class KeyRegisterModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String districtNumber;
	private String adress;
	private String adressMoreInfo;
	private String keyModel;
	private String keySystemNumber;
	private String keyType;
	private String keyFRAS;
	private String keyProfile;
	private String codesinfo;
	private String adressOwnerContactDetails;
	private String ownerMoreInfo;
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	private String keyUpdateLog;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDistrictNumber() {
		return districtNumber;
	}
	public void setDistrictNumber(String districtNumber) {
		this.districtNumber = districtNumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAdressMoreInfo() {
		return adressMoreInfo;
	}
	public void setAdressMoreInfo(String adressMoreInfo) {
		this.adressMoreInfo = adressMoreInfo;
	}
	public String getKeyModel() {
		return keyModel;
	}
	public void setKeyModel(String keyModel) {
		this.keyModel = keyModel;
	}
	public String getKeySystemNumber() {
		return keySystemNumber;
	}
	public void setKeySystemNumber(String keySystemNumber) {
		this.keySystemNumber = keySystemNumber;
	}
	public String getKeyType() {
		return keyType;
	}
	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}
	public String getKeyFRAS() {
		return keyFRAS;
	}
	public void setKeyFRAS(String keyFRAS) {
		this.keyFRAS = keyFRAS;
	}
	public String getKeyProfile() {
		return keyProfile;
	}
	public void setKeyProfile(String keyProfile) {
		this.keyProfile = keyProfile;
	}
	public String getCodesinfo() {
		return codesinfo;
	}
	public void setCodesinfo(String codesinfo) {
		this.codesinfo = codesinfo;
	}
	public String getAdressOwnerContactDetails() {
		return adressOwnerContactDetails;
	}
	public void setAdressOwnerContactDetails(String adressOwnerContactDetails) {
		this.adressOwnerContactDetails = adressOwnerContactDetails;
	}
	public String getOwnerMoreInfo() {
		return ownerMoreInfo;
	}
	public void setOwnerMoreInfo(String ownerMoreInfo) {
		this.ownerMoreInfo = ownerMoreInfo;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getKeyUpdateLog() {
		return keyUpdateLog;
	}
	public void setKeyUpdateLog(String keyUpdateLog) {
		this.keyUpdateLog = keyUpdateLog;
	}
	

}
