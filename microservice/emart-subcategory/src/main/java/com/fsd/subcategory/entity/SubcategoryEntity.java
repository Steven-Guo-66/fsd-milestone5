package com.fsd.subcategory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcategory")
public class SubcategoryEntity {
	private Integer subcategoryId;
	private String subcategoryName;
	private Integer categoryId;
	private String briefDetails;
	private String gst;

	/**
	 * @return the subcategoryId
	 */
	@Id
	@GeneratedValue
	@Column(name = "subcategory_id")
	public Integer getSubcategoryId() {
		return subcategoryId;
	}

	/**
	 * @param subcategoryId the subcategoryId to set
	 */
	public void setSubcategoryId(Integer subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	/**
	 * @return the subcategoryName
	 */
	@Column(name = "subcategory_name")
	public String getSubcategoryName() {
		return subcategoryName;
	}

	/**
	 * @param subcategoryName the subcategoryName to set
	 */
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}

	/**
	 * @return the categoryId
	 */
	@Column(name = "category_id")
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the briefDetails
	 */
	@Column(name = "brief_details")
	public String getBriefDetails() {
		return briefDetails;
	}

	/**
	 * @param briefDetails the briefDetails to set
	 */
	public void setBriefDetails(String briefDetails) {
		this.briefDetails = briefDetails;
	}

	/**
	 * @return the gst
	 */
	@Column(name = "GST")
	public String getGst() {
		return gst;
	}

	/**
	 * @param gst the gst to set
	 */
	public void setGst(String gst) {
		this.gst = gst;
	}

}
