package com.fsd.items.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class ItemsEntity {
	private Integer id;
	private Integer categoryId;
	private Integer subcategoryId;
	private String subcategoryName;
	private String price;
	private String itemName;
	private String description;
	private String stockNumber;
	private String remarks;

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
	 * @return the subcategoryId
	 */
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
	 * @return the price
	 */
	@Column(name = "price")
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the itemName
	 */
	@Column(name = "item_name")
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the description
	 */
	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the stockNumber
	 */
	@Column(name = "stock_number")
	public String getStockNumber() {
		return stockNumber;
	}

	/**
	 * @param stockNumber the stockNumber to set
	 */
	public void setStockNumber(String stockNumber) {
		this.stockNumber = stockNumber;
	}

	/**
	 * @return the remarks
	 */
	@Column(name = "remarks")
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
