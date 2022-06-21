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
@Table
@Getter
@Setter
@NoArgsConstructor
public class RAM extends Product{
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
	
	@OneToMany(mappedBy="pcRAM")
	@ToString.Exclude
	private Collection<PC> computers;
	
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
