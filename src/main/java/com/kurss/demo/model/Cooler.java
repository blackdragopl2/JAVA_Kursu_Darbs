package com.kurss.demo.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Cooler extends Product{
	@Column(name="CPU_socket")
	@Size(min=3, max=150)
	String CPUSocket;
	
	@Column(name="NumberOfFans")
	@Min(1)
	@Max(12)
	int numberOfFans;
	
	@Column(name="RotationalSpeed")
	@Min(5)
	@Max(15000)
	int rotationalSpeed;
	
	@Column(name="NoiseLevel")
	@Min(0)
	@Max(100)
	int noiseLevel;
	
	@Column(name="HeightOfCooler")
	@Min(1)
	@Max(10000)
	int height;
	
	@Column(name="WidthOfCooler")
	@Min(1)
	@Max(10000)
	int width;
	
	@Column(name="LengthOfCooler")
	@Min(1)
	@Max(10000)
	int length;
	
	@Column(name="WeightOfCooler")
	@Min(1)
	@Max(10000)
	int weight;
	
	@Column(name="CoolerCompany")
	CoolerCompanies coolerCompany;
	
	@OneToMany(mappedBy="pcCooler")
	@ToString.Exclude
	private Collection<PC> computers;
	
	public Cooler(String title, double price, ProductTypes type, int amount, String linkImage, String CPUSocket, int numberOfFans, int rotationalSpeed, int noiseLevel, int height, int width, int length, int weight, CoolerCompanies coolerCompany)
	{
		super(title, price, type, amount, linkImage);
		setCoolerCompany(coolerCompany);
		setCPUSocket(CPUSocket);
		setHeight(height);
		setLength(length);
		setWidth(width);
		setNoiseLevel(noiseLevel);
		setNumberOfFans(numberOfFans);
		setRotationalSpeed(rotationalSpeed);
		setWeight(weight);
	}
}
