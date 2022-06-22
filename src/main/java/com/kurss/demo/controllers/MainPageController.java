package com.kurss.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kurss.demo.model.Product;
import com.kurss.demo.services.ICRUDService;

@Controller
@RequestMapping("/main")
public class MainPageController {
	@Autowired
	private ICRUDService CRUDService;
	
	@GetMapping
	public String getShowAllProducts(Model model)
	{
		try
		{
			ArrayList<Product> allProductsForSending = CRUDService.selectAllProducts();
			model.addAttribute("package", allProductsForSending);
			return "product-all-page";
		} catch (Exception e)
		{
			e.printStackTrace();
			return "error-page";
		}
	}
	
}
