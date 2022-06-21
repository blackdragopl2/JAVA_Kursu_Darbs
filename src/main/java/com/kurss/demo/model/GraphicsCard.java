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
public class GraphicsCard extends Product{
	@Column(name="GPU_speed")
	int GPUSpeed;
	
	@Column(name="RAM")
	int RAM;
	
	@Column(name="RAM_type")
	String RAMType;
	
	@Column(name="RAM_frequency")
	int RAMFrequency;

	@Column(name="Data_bus")
	String dataBus;
	
	@Column(name="Cooling_type")
	String coolingType;
	
	@Column(name="Connectors")
	String connectors;
	
	@Column(name="Card_company")
	CardCompanies cardCompany;

	@OneToMany(mappedBy="pcGraphicsCard")
	@ToString.Exclude
	private Collection<PC> computers;
	
	public GraphicsCard(String title, double price, ProductTypes type, int amount, String linkImage, int GPUSpeed, int RAM,
			String RAMType, int RAMFrequency, String dataBus, String coolingType, String connectors, CardCompanies cardCompany)
	{
		super(title, price, type, amount, linkImage);
		setCardCompany(cardCompany);
		setConnectors(connectors);
		setCoolingType(coolingType);
		setDataBus(dataBus);
		setGPUSpeed(GPUSpeed);
		setRAM(RAM);
		setRAMFrequency(RAMFrequency);
		setRAMType(RAMType);
	}
}
