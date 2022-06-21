package com.kurss.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class PC {
	@Id
	@Column(name="ID_PC")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	private int ID_PC;
	
	@ManyToOne
	@JoinColumn(name="ID_CASE")
	private Case pcCase;
	
	@ManyToOne
	@JoinColumn(name="ID_COOL")
	private Cooler pcCooler;
	
	@ManyToOne
	@JoinColumn(name="ID_GC")
	private GraphicsCard pcGraphicsCard;
	
	@ManyToOne
	@JoinColumn(name="ID_MB")
	private Motherboard pcMotherboard;
	
	@ManyToOne
	@JoinColumn(name="ID_RAM")
	private RAM pcRAM;
	
	@ManyToOne
	@JoinColumn(name="ID_PROC")
	private Processor pcProcessor;
	
	@ManyToOne
	@JoinColumn(name="ID_PWR")
	private PowerSupply pcPowerSupply;
	
	@Column(name="PC_price")
	private double price;
	
	//through IDs
	public PC(Case pcCase, Cooler pcCooler, GraphicsCard pcGraphicsCard, Motherboard pcMotherboard, RAM pcRAM, Processor pcProcessor, PowerSupply pcPowerSupply)
	{
		setPcCase(pcCase);
		setPcCooler(pcCooler);
		setPcGraphicsCard(pcGraphicsCard);
		setPcMotherboard(pcMotherboard);
		setPcPowerSupply(pcPowerSupply);
		setPcProcessor(pcProcessor);
		setPcRAM(pcRAM);
		setPrice(pcCase.getPrice()+pcCooler.getPrice()+
				pcGraphicsCard.getPrice()+pcMotherboard.getPrice()+
				pcPowerSupply.getPrice()+pcProcessor.getPrice()+pcRAM.getPrice());
	}
}
