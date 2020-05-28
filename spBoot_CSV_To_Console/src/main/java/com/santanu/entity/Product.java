package com.santanu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCT_DTLS")
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private float prodPrice;

}
