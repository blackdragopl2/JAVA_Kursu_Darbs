package com.kurss.demo.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ID_PWR")
@Getter
@Setter
@NoArgsConstructor
public class PowerSupply extends Product {
	@Column(name="PowerSupply")
	@Min(100)
	@Max(2000)
	int supply; //amount of power produced
	
	@Column(name="VolumeOfCooler")
	@Min(0)
	@Max(100)
	int volume; //in dBA
	
	@Column(name="Modularity")
	boolean modular; //True - is modular, False - has fixed cables
	
	@Column(name="ConstructionType")
	String construction; //Construction type
	
	@Column(name="PowerSupplyCompany")
	PowerSupplyCompanies psc;
	
	@Column(name="certificate")
	Certificates certificate;
	
	@OneToMany(mappedBy="pcPowerSupply")
	@ToString.Exclude
	private Collection<PC> computers;
	
	public PowerSupply(String title, double price, ProductTypes type, int amount, String linkImage, int supply, int volume, boolean modular, String construction, PowerSupplyCompanies psc, Certificates certificate)
	{
		super(title, price, type, amount, linkImage);
		setSupply(supply);
		setVolume(volume);
		setModular(modular);
		setConstruction(construction);
		setPsc(psc);
		setCertificate(certificate);
	}
}
