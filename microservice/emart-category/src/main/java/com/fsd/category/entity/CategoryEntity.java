package com.fsd.category.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity {
	private Integer categoryId;
	private String categoryName;
	private String briefDetails;

	/**
	 * @return the categoryId
	 */
	@Id
	@GeneratedValue
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
	 * @return the categoryName
	 */
	@Column(name = "category_name")
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

}
