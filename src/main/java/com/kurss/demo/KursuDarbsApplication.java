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
import com.kurss.demo.model.Monitor;
import com.kurss.demo.model.MonitorCompanies;
import com.kurss.demo.model.Motherboard;
import com.kurss.demo.model.Mouse;
import com.kurss.demo.model.MouseCompanies;
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
				//Cooler cool1 = new Cooler("Aerocool PGS Air Frost 2 FRGB", 20.00, ProductTypes.ComputerPart, 100, "https://oreol.eu/image/cache/products/968/95-1200x800.jpg", "1150/1151/1155/1156/1200", 1, 1800, 25, 78, 114, 920, 150, CoolerCompanies.AEROCOOL);
				
				Case case1 = new Case("Cooler Master MasterCase H100 ARGB", 70.99, ProductTypes.ComputerPart, 100, "https://cdn.discordapp.com/attachments/689225518125547530/990257083490390076/component2.jpg", 300, 400, 500, "Low Tower", CaseCompanies.COOLERMASTER);
				Case case2 = new Case("Vetro K1 ATX Mid Tower SPCC Gray Cases", 159.99, ProductTypes.ComputerPart, 200, "https://cdn.discordapp.com/attachments/689225518125547530/990257083721060442/component3.jpg", 500, 200, 300, "Mid Tower", CaseCompanies.VETRO);
				
				
				
				GraphicsCard card1 = new GraphicsCard("GeForce GTX 1070 Ti GAMING 8G", 470.99, ProductTypes.ComputerPart, 200, "https://cdn.discordapp.com/attachments/689225518125547530/990257085050675251/component8.jpg", 1632, 8, "GDDR5 256bit memory", 1721 , "Standard", "WINDFORCE 3X with Blade Fan Design", "2*DP1.3 connectors", CardCompanies.AMD);
				
				
				Keyboard keyboard1 = new Keyboard("Razer Huntsman V2 - keyboard - QWERTY - US", 299.99, ProductTypes.Accessory, 250, "https://cdn.discordapp.com/attachments/689225518125547530/990257083326803998/component1.jpg", true, false, KeyboardTypes.MECHANICAL, KeyboardCompanies.RAZER);
				
				//Motherboard motherboard1 = new Motherboard("Motherboard", 120.00, ProductTypes.ComputerPart, 100, "image", "typeofboard", "chipset", "socket", "standard", 4, false, BoardCompanies.ASUS);
				PowerSupply powerSupply1 = new PowerSupply("FireStorm W750 PC Power & Cooling", 140.99, ProductTypes.ComputerPart, 250, "https://cdn.discordapp.com/attachments/689225518125547530/990257084849332234/component7.jpg", 750, 50, true, "ATX", PowerSupplyCompanies.FIRESTORM, Certificates.EIGHTY_PLUS_BRONZE);
				//Processor processor1 = new Processor("processor", 180.00, ProductTypes.ComputerPart, 300, "image", ProcessorLines.AMD_RYZEN, 5, 6, 2000, 3500, false, "architecture");
				
				RAM ram1 = new RAM("G.Skill Trident Z RGB Series 16GB (2 x 8GB)", 90.99, ProductTypes.ComputerPart, 300, "https://cdn.discordapp.com/attachments/689225518125547530/990257084220207144/component5.jpg", "DDR4", 16, 2, 3200, 16, RAMCompanies.GSKILL);
				Mouse mouse1 = new Mouse("Trust GXT 107 Izza", 25.99, ProductTypes.Accessory, 200, "https://cdn.discordapp.com/attachments/689225518125547530/990257083981111306/component4.jpg", true, true, 3500, 6, MouseCompanies.TRUST);
				Monitor monitor1 = new Monitor("35\" Predator Z35 Curved Gaming Monitor", 500.99, ProductTypes.Accessory, 300, "https://cdn.discordapp.com/attachments/689225518125547530/990257084538978314/component6.jpg", "35 Inches", "27\" 1800R full HD (1920 x 1080) Curved widescreen with NVIDIA G-SYNC technology", "1920 x 1080", "2560 x 1080", "16x9", 144, MonitorCompanies.ACER);
				
				productRepo.save(monitor1);
				//productRepo.save(cool1);
				productRepo.save(case1);
				productRepo.save(mouse1);
				productRepo.save(case2);
				productRepo.save(card1);
				productRepo.save(keyboard1);
				//productRepo.save(motherboard1);
				productRepo.save(powerSupply1);
				//productRepo.save(processor1);
				productRepo.save(ram1);
				
				//PC computer1 = new PC(case1, cool1, card1, motherboard1, ram1, processor1, powerSupply1);
				//PCRepo.save(computer1);
			}
		};
	}
}
