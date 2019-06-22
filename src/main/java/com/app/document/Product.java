package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	@Id
	private String id;
	
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	public Product() {
		super();
	}
	public Product(Integer prodId, String prodCode, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	
	
}
