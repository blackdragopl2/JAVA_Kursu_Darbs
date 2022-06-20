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
@PrimaryKeyJoinColumn(name="ID_RAM")
@Getter
@Setter
@NoArgsConstructor
public class RAM extends Product{

	@Id
	@Column(name="ID_RAM")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	int ID_RAM;
	
	@Column(name="RAM_Type")
	String RAMType;
	
	@Column(name="RAM_Capacity")
	int RAMCapacity;
	
	@Column(name="Number_of_modules")
	int numberOfModules;
	
	@Column(name="Operating_frequency")
	int operatingFrequency;
	
	@Column(name="Delay_Time")
	int delay;
	
	@Column(name="RAM_Company")
	RAMCompanies RAMCompany;
	
	public RAM(String title, double price, ProductTypes type, int amount, String linkImage, String RAMType,
			int RAMCapacity, int numberOfModules, int operatingFrequency, int delay, RAMCompanies RAMCompany)
	{
		super(title, price, type, amount, linkImage);
		setDelay(delay);
		setNumberOfModules(numberOfModules);
		setOperatingFrequency(operatingFrequency);
		setRAMCapacity(RAMCapacity);
		setRAMCompany(RAMCompany);
		setRAMType(RAMType);
	}
}
