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
public class Motherboard extends Product{
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
	
	@OneToMany(mappedBy="pcMotherboard")
	@ToString.Exclude
	private Collection<PC> computers;
	
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
