package com.fsd.purchase.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_history")
public class PurchaseEntity {
	private Integer id;
	private Integer buyerId;
	private Integer sellerId;
	private Integer transactionId;
	private Integer itemId;
	private String NumberOfItems;
	private Date dateTime;
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
	 * @return the buyerId
	 */
	@Column(name = "Buyer_id")
	public Integer getBuyerId() {
		return buyerId;
	}

	/**
	 * @param buyerId the buyerId to set
	 */
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	/**
	 * @return the sellerId
	 */
	@Column(name = "Seller_id")
	public Integer getSellerId() {
		return sellerId;
	}

	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * @return the transactionId
	 */
	@Column(name = "Transaction_id")
	public Integer getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the itemId
	 */
	@Column(name = "Item_id")
	public Integer getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the numberOfItems
	 */
	@Column(name = "Number_of_items")
	public String getNumberOfItems() {
		return NumberOfItems;
	}

	/**
	 * @param numberOfItems the numberOfItems to set
	 */
	public void setNumberOfItems(String numberOfItems) {
		NumberOfItems = numberOfItems;
	}

	/**
	 * @return the dateTime
	 */
	@Column(name = "Date_time")
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
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
