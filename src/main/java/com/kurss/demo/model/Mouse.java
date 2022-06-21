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
public class Mouse extends Product{
	@Column(name="RGB")
	boolean RGB;
	
	@Column(name="Bluetooth")
	boolean bluetooth;
	
	@Column(name="DPI")
	int DPI;
	
	@Column(name="Amount_of_buttons")
	int amountOfButtons;
	
	@Column(name="Mouse_company")
	MouseCompanies mouseCompany;
	
	public Mouse(String title, double price, ProductTypes type, int amount, String linkImage,
			boolean RGB, boolean bluetooth, int DPI, int amountOfButtons, MouseCompanies mouseCompany)
	{
		super(title, price, type, amount, linkImage);
		setRGB(RGB);
		setBluetooth(bluetooth);
		setDPI(DPI);
		setAmountOfButtons(amountOfButtons);
		setMouseCompany(mouseCompany);
	}
}
