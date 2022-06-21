package com.kurss.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
public class Product {
	@Id
	@Column(name="ID_PRODUCT")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	int ID_PROD;
	
	@Column(name="ProdTitle")
	@Size(min = 3, max = 150)
	String title;
	
	@Column(name="ProdPrice")
	@Min(0)
	double price;
	
	@Column(name="ProdType")
	ProductTypes type;
	
	@Column(name="ProdAmount")
	@Min(0)
	int amount;
	
	@Column(name="LinkToImage")
	String linkImage;
	
	public Product(String title, double price, ProductTypes type, int amount, String linkImage)
	{
		setLinkImage(linkImage);
		setAmount(amount);
		setTitle(title);
		setPrice(price);
		setType(type);
	}
}
