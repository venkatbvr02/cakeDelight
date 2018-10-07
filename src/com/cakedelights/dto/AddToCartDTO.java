package com.cakedelights.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="addingtocart")
public class AddToCartDTO {
	@Id
	@Column(name="slno")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slno;
	@Column(name="username")
	private String username;
	@Column(name="productID")
	private String productName;
	@Column(name="productDescription")
	private String productDescription;
	@Column(name="doc")
	private Date doc;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Date getDoc() {
		return doc;
	}
	public void setDoc(Date doc) {
		this.doc = doc;
	}

}
