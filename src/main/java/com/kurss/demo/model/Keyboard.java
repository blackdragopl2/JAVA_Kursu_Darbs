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
@PrimaryKeyJoinColumn(name="ID_KBD")
@Getter
@Setter
@NoArgsConstructor
public class Keyboard extends Product{
	@Id
	@Column(name="ID_KBD")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	int ID_KBD;
	
	@Column(name="RGB")
	boolean RGB;
	
	@Column(name="Bluetooth")
	boolean bluetooth;
	
	@Column(name="Keyboard_type")
	KeyboardTypes keyboardType;
	
	@Column(name="Keyboard_company")
	KeyboardCompanies keyboardCompany;
	
	public Keyboard(String title, double price, ProductTypes type, int amount, String linkImage, boolean RGB, boolean bluetooth, KeyboardTypes keyboardType, KeyboardCompanies keyboardCompany)
	{
		super(title, price, type, amount, linkImage);
		setBluetooth(bluetooth);
		setRGB(RGB);
		setKeyboardCompany(keyboardCompany);
		setKeyboardType(keyboardType);
	}
}
