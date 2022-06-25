package com.kurss.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Monitor extends Product{
	@Column(name="Screen_type")
	String screenType;
	
	@Column(name="Screen_size")
	String screenSize;
	
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
			String screenSize, String screenTechnology, String resolution, String aspectRatio, int refreshRate, MonitorCompanies monitorCompany)
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
