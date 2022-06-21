package com.kurss.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kurss.demo.model.BoardCompanies;
import com.kurss.demo.model.CardCompanies;
import com.kurss.demo.model.Case;
import com.kurss.demo.model.CaseCompanies;
import com.kurss.demo.model.Certificates;
import com.kurss.demo.model.Cooler;
import com.kurss.demo.model.CoolerCompanies;
import com.kurss.demo.model.GraphicsCard;
import com.kurss.demo.model.Keyboard;
import com.kurss.demo.model.KeyboardCompanies;
import com.kurss.demo.model.KeyboardTypes;
import com.kurss.demo.model.Motherboard;
import com.kurss.demo.model.PC;
import com.kurss.demo.model.PowerSupply;
import com.kurss.demo.model.PowerSupplyCompanies;
import com.kurss.demo.model.Processor;
import com.kurss.demo.model.ProcessorLines;
import com.kurss.demo.model.ProductTypes;
import com.kurss.demo.model.RAM;
import com.kurss.demo.model.RAMCompanies;
import com.kurss.demo.repos.IPCRepo;
import com.kurss.demo.repos.IProductRepo;


@SpringBootApplication
public class KursuDarbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursuDarbsApplication.class, args);
	}

	@Bean
	public CommandLineRunner testdb(IPCRepo PCRepo, IProductRepo productRepo)
	{
		return new CommandLineRunner()
		{
			@Override
			public void run(String... args) throws Exception
			{	
				Cooler cool1 = new Cooler("Aerocool PGS Air Frost 2 FRGB", 20.00, ProductTypes.ComputerPart, 100, "https://oreol.eu/image/cache/products/968/95-1200x800.jpg", "1150/1151/1155/1156/1200", 1, 1800, 25, 78, 114, 920, 150, CoolerCompanies.AEROCOOL);
				Case case1 = new Case("Test Case", 34.00, ProductTypes.ComputerPart, 100, "https://oreol.eu/image/cache/products/968/95-1200x800.jpg", 300, 400, 500, "Full Tower", CaseCompanies.AEROCOOL);
				GraphicsCard card1 = new GraphicsCard("Test Card", 65.00, ProductTypes.ComputerPart, 200, "image", 300, 8000, "type1", 10000, "bus1", "3fans", "connector", CardCompanies.AMD);
				Keyboard keyboard1 = new Keyboard("keyboard1", 230.00, ProductTypes.Accessory, 250, "image", true, false, KeyboardTypes.FLEXIBLE, KeyboardCompanies.APPLE);
				Motherboard motherboard1 = new Motherboard("Motheroard", 120.00, ProductTypes.ComputerPart, 100, "image", "typeofboard", "chipset", "socket", "standard", 4, false, BoardCompanies.ASUS);
				PowerSupply powerSupply1 = new PowerSupply("PowerSupply", 60.00, ProductTypes.ComputerPart, 250, "image", 500, 50, true, "construction", PowerSupplyCompanies.AEROCOOL, Certificates.EIGHTY_PLUS_BRONZE);
				Processor processor1 = new Processor("processor", 180.00, ProductTypes.ComputerPart, 300, "image", ProcessorLines.AMD_RYZEN, 5, 6, 2000, 3500, false, "architecture");
				RAM ram1 = new RAM("ram", 200.00, ProductTypes.ComputerPart, 300, "image", "ramType", 8000, 5, 3300, 70, RAMCompanies.CORSAIR);
				
				productRepo.save(cool1);
				productRepo.save(case1);
				productRepo.save(card1);
				productRepo.save(keyboard1);
				productRepo.save(motherboard1);
				productRepo.save(powerSupply1);
				productRepo.save(processor1);
				productRepo.save(ram1);
				
				PC computer1 = new PC(case1, cool1, card1, motherboard1, ram1, processor1, powerSupply1);
				PCRepo.save(computer1);
			}
		};
	}
}
