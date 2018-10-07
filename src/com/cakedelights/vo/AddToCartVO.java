package com.cakedelights.vo;

import java.sql.Date;

public class AddToCartVO {
private int slno;
private String username;
private String productID;
private String productDescription;
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
public String getProductID() {
	return productID;
}
public void setProductID(String productID) {
	this.productID = productID;
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

