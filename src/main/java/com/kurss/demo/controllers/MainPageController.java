package com.kurss.demo.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kurss.demo.model.Case;
import com.kurss.demo.model.Cooler;
import com.kurss.demo.model.GraphicsCard;
import com.kurss.demo.model.Keyboard;
import com.kurss.demo.model.Monitor;
import com.kurss.demo.model.Motherboard;
import com.kurss.demo.model.Mouse;
import com.kurss.demo.model.PowerSupply;
import com.kurss.demo.model.Processor;
import com.kurss.demo.model.Product;
import com.kurss.demo.model.RAM;
import com.kurss.demo.services.ICRUDService;

@Controller
@RequestMapping("/main")
public class MainPageController {
	@Autowired
	private ICRUDService CRUDService;
	
	@GetMapping
	public String getShowMainPage(Model model)
	{
		try
		{
			return "index";
		} catch (Exception e)
		{
			e.printStackTrace();
			return "error-page";
		}
	}
	
	@GetMapping("/products")
	public String getShowAllProducts(Model model)
	{
		try
		{
			ArrayList<Product> allProductsForSending = CRUDService.selectAllProducts();
			model.addAttribute("package", allProductsForSending);
			return "components";
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "error-page";
		}
	}
	
	@GetMapping("/products/{ID_PRODUCT}")
	public String getShowProductOne(@PathVariable(name="ID_PRODUCT") int ID_PRODUCT, Model model)
	{
		try
		{
			Product productForSending = CRUDService.selectProduct(ID_PRODUCT);
			model.addAttribute("package", productForSending);
			return "product";
		} catch (Exception e)
		{
			e.printStackTrace();
			return "error-page";
		}
	}
	
	@GetMapping("/remove")
	public String getAllProductsForDeletion(Model model)
	{
		try
		{
			ArrayList<Product> allProductsForSending = CRUDService.selectAllProducts();
			model.addAttribute("package", allProductsForSending);
			return "deletePage";
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "error-page";
		}
	}
	
	
	@GetMapping("/remove/{ID_PRODUCT}")
	public String getRemoveTeacherById(@PathVariable(name="ID_PRODUCT") int ID_PRODUCT, Model model)
	{
		try
		{
			CRUDService.deleteProductByID(ID_PRODUCT);
			ArrayList<Product> allProductsForSending = CRUDService.selectAllProducts();
			model.addAttribute("package", allProductsForSending);
			return "deletePage";
		} catch (Exception e)
		{
			return "error-page";
		}
	}
	
	@GetMapping("/add")
	public String getAddNewComponent()
	{
		return "createComponent";
	}
	
	@GetMapping("/add/case")
	public String getAddNewCase(Case ComputerCase)
	{
		return "createCase";
	}
	
	@PostMapping("/add/case")
	public String postAddNewCase(@Valid Case ComputerCase, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(ComputerCase);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createCase";
	}
	
	
	@GetMapping("/add/cooler")
	public String getAddNewCooler(Cooler cooler)
	{
		return "createCooler";
	}
	
	@PostMapping("/add/cooler")
	public String postAddNewCooler(@Valid Cooler cooler, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(cooler);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createCooler";
	}
	
	
	@GetMapping("/add/graphicsCard")
	public String getAddNewGraphicsCard(GraphicsCard graphicsCard)
	{
		return "createGraphicsCard";
	}
	
	@PostMapping("/add/graphicsCard")
	public String postAddNewGraphicsCard(@Valid GraphicsCard graphicsCard, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(graphicsCard);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createGraphicsCard";
	}
	
	@GetMapping("/add/keyboard")
	public String getAddNewKeyboard(Keyboard keyboard)
	{
		return "createKeyboard";
	}
	
	@PostMapping("/add/keyboard")
	public String postAddNewKeyboard(@Valid Keyboard keyboard, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(keyboard);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createKeyboard";
	}
	
	
	@GetMapping("/add/monitor")
	public String getAddNewMonitor(Monitor monitor)
	{
		return "createMonitor";
	}
	
	@PostMapping("/add/monitor")
	public String postAddNewMonitor(@Valid Monitor monitor, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(monitor);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createMonitor";
	}
	
	@GetMapping("/add/motherboard")
	public String getAddNewMotherboard(Motherboard motherboard)
	{
		return "createMotherboard";
	}
	
	@PostMapping("/add/motherboard")
	public String postAddNewMotherboard(@Valid Mouse motherboard, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(motherboard);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createMotherboard";
	}
	
	
	
	@GetMapping("/add/mouse")
	public String getAddNewMouse(Mouse mouse)
	{
		return "createMouse";
	}
	
	@PostMapping("/add/mouse")
	public String postAddNewMouse(@Valid Mouse mouse, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(mouse);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createMouse";
	}
	
	
	
	
	
	@GetMapping("/add/powerSupply")
	public String getAddNewPowerSupply(PowerSupply powerSupply)
	{
		return "createPowerSupply";
	}
	
	@PostMapping("/add/powerSupply")
	public String postAddNewMouse(@Valid PowerSupply powerSupply, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(powerSupply);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createPowerSupply";
	}
	
	
	
	
	@GetMapping("/add/processor")
	public String getAddNewProcessor(Processor processor)
	{
		return "createProcessor";
	}
	
	@PostMapping("/add/processor")
	public String postAddNewProcessor(@Valid Processor processor, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(processor);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createProcessor";
	}
	
	
	@GetMapping("/add/ram")
	public String getAddNewRAM(RAM ram)
	{
		return "createRAM";
	}
	
	@PostMapping("/add/ram")
	public String postAddNewRAM(@Valid RAM ram, BindingResult result)
	{
		if(!result.hasErrors())
		{
			try 
			{
				CRUDService.addNewProduct(ram);
				return "redirect:/main/add";
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return "error-page";
			}
		}
		else
			return "createRAM";
	}
}
