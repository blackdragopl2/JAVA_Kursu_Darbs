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
@PrimaryKeyJoinColumn(name="ID_MOUSE")
@Getter
@Setter
@NoArgsConstructor
public class Mouse extends Product{
	@Id
	@Column(name="ID_MOUSE")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	int ID_MOUSE;
	
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
