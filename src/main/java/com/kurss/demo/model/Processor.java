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
@PrimaryKeyJoinColumn(name="ID_PROC")
@Getter
@Setter
@NoArgsConstructor
public class Processor extends Product{

	@Id
	@Column(name="ID_PROC")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Setter(value=AccessLevel.NONE)
	int ID_PROC;
	
	@Column(name="Processor_line")
	ProcessorLines line;
	
	@Column(name="Number_of_cores")
	int cores;
	
	@Column(name="Number_of_threads")
	int threads;
	
	@Column(name="Frequency")
	int frequency;
	
	@Column(name="Frequency_turbo")
	int frequencyTurbo;
	
	@Column(name="Integrated_graphics")
	boolean integratedGraphics;
	
	@Column(name="Architecture")
	String architecture;
	
	public Processor(String title, double price, ProductTypes type, int amount, String linkImage, ProcessorLines line, int cores, 
			int threads, int frequency, int frequencyTurbo
			, boolean integratedGraphics, String architecture)
	{
		super(title, price, type, amount, linkImage);
		setLine(line);
		setThreads(threads);
		setArchitecture(architecture);
		setCores(cores);
		setFrequency(frequency);
		setFrequencyTurbo(frequencyTurbo);
		setIntegratedGraphics(integratedGraphics);

	}
}
