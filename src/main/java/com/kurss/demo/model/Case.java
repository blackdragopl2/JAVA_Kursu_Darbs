package com.kurss.demo.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ComputerCase")
@Getter
@Setter
@NoArgsConstructor
public class Case extends Product{
	@Column(name="Case_height")
	int height;
	
	@Column(name="Case_width")
	int width;
	
	@Column(name="Case_length")
	int length;
	
	@Column(name="Type_of_case")
	String typeOfCase;
	
	@Column(name="Case_company")
	CaseCompanies caseCompany;
	
	@OneToMany(mappedBy="pcCase")
	@ToString.Exclude
	private Collection<PC> computers;
	
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
