package com.kurss.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ID_PWR")
@Getter
@Setter
@NoArgsConstructor
public class PowerSupply extends Product {
	
	@Id
	@Column(name="ID_POWER")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	int ID_PWR;
	
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
	
	public PowerSupply(String title, double price, ProductTypes type, int supply, int volume, boolean modular, String construction, PowerSupplyCompanies psc, Certificates certificate)
	{
		super(title, price, type);
		setSupply(supply);
		setVolume(volume);
		setModular(modular);
		setConstruction(construction);
		setPsc(psc);
		setCertificate(certificate);
	}
}
