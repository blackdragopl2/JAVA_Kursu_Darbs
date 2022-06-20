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
@PrimaryKeyJoinColumn(name="ID_MON")
@Getter
@Setter
@NoArgsConstructor
public class Monitor extends Product{
	@Id
	@Column(name="ID_MON")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	int ID_MON;
	
	@Column(name="Screen_type")
	String screenType;
	
	@Column(name="Screen_size")
	double screenSize;
	
	@Column(name="Screen_technology")
	String screenTechnology;
	
	@Column(name="Screen_resolution")
	String resolution;
	
	@Column(name="Aspect_ratio")
	String aspectRatio;
	
	@Column(name="Refresh_rate")
	int refreshRate;
	
	@Column(name="Monitor_company")
	MonitorCompanies monitorCompany;
	
	public Monitor(String title, double price, ProductTypes type, int amount, String linkImage, String screenType,
			double screenSize, String screenTechnology, String resolution, String aspectRatio, int refreshRate, MonitorCompanies monitorCompany)
	{
		super(title, price, type, amount, linkImage);
		setScreenType(screenType);
		setScreenSize(screenSize);
		setScreenTechnology(screenTechnology);
		setResolution(resolution);
		setRefreshRate(refreshRate);
		setMonitorCompany(monitorCompany);
	}
}
