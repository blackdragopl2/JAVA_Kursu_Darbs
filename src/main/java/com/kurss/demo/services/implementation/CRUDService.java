package com.kurss.demo.services.implementation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kurss.demo.model.Product;
import com.kurss.demo.repos.IProductRepo;
import com.kurss.demo.services.ICRUDService;

@Service
public class CRUDService implements ICRUDService{
	@Autowired
	private IProductRepo productRepo;
	
	public ArrayList<Product> selectAllProducts()
	{
		ArrayList<Product> products= (ArrayList<Product>) productRepo.findAll();
		return products;
	};
}
