package com.fsd.seller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")
public class SellerEntity {
	private Integer id;
	private String username;
	private String password;
	private String companyName;
	private String gstin;
	private String briefAboutCompany;
	private String postalAddress;
	private String website;
	private String emailid;
	private String contactNumber;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the companyName
	 */
	@Column(name = "companyname")
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the gstin
	 */
	@Column(name = "GSTIN")
	public String getGstin() {
		return gstin;
	}

	/**
	 * @param gstin the gstin to set
	 */
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	/**
	 * @return the briefAboutCompany
	 */
	@Column(name = "brief_about_company")
	public String getBriefAboutCompany() {
		return briefAboutCompany;
	}

	/**
	 * @param briefAboutCompany the briefAboutCompany to set
	 */
	public void setBriefAboutCompany(String briefAboutCompany) {
		this.briefAboutCompany = briefAboutCompany;
	}

	/**
	 * @return the postalAddress
	 */
	@Column(name = "postal_address")
	public String getPostalAddress() {
		return postalAddress;
	}

	/**
	 * @param postalAddress the postalAddress to set
	 */
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	/**
	 * @return the website
	 */
	@Column(name = "website")
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the email
	 */
	@Column(name = "emailid")
	public String getEmail() {
		return emailid;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String emailid) {
		this.emailid = emailid;
	}

	/**
	 * @return the contactNumber
	 */
	@Column(name = "contact_number")
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
