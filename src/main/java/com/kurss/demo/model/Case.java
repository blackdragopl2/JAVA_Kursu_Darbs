package com.kurss.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ID_CASE")
@Getter
@Setter
@NoArgsConstructor
public class Case extends Product{
	@Id
	@Column(name="ID_CASE")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	int ID_CASE;
	
	int height;
	
	int width;
	
	int length;
	
	String typeOfCase;
	
	CaseCompanies caseCompany;
	
	public Case(String title, double price, ProductTypes type, int amount, String linkImage,
			int height, int width, int length, String typeOfCase, CaseCompanies caseCompany)
	{
		super(title, price, type, amount, linkImage);
		setHeight(height);
		setWidth(width);
		setLength(length);
		setTypeOfCase(typeOfCase);
		setCaseCompany(caseCompany);
	}
}
