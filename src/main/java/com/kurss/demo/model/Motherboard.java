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
@PrimaryKeyJoinColumn(name="ID_MB")
@Getter
@Setter
@NoArgsConstructor
public class Motherboard extends Product{
	@Id
	@Column(name="ID_MB")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	private int ID_MB;
	
	@Column(name="Board_type")
	private String typeOfBoard;
	
	@Column(name="Chipset")
	private String chipset;
	
	@Column(name="CPU_socket")
	private String CPUSocket;
	
	@Column(name="Memory_standard")
	private String memoryStandard;
	
	@Column(name="Memory_slots")
	private int memorySlots;
	
	@Column(name="Integrated_graphics")
	private boolean integratedGraphics;
	
	@Column(name="Board_company")
	private BoardCompanies boardCompany;
	
	public Motherboard(String title, double price, ProductTypes type, int amount, String linkImage, String typeOfBoard, 
			String chipset, String CPUSocket, String memoryStandard, int memorySlots, boolean integratedGraphics, BoardCompanies boardCompany)
	{
		super(title, price, type, amount, linkImage);
		setBoardCompany(boardCompany);
		setChipset(chipset);
		setCPUSocket(CPUSocket);
		setIntegratedGraphics(integratedGraphics);
		setMemorySlots(memorySlots);
		setMemoryStandard(memoryStandard);
		setTypeOfBoard(typeOfBoard);
	}
	
}
