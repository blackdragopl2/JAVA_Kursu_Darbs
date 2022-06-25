package com.kurss.demo.services;

import java.util.ArrayList;

import com.kurss.demo.model.Case;
import com.kurss.demo.model.Product;

public interface ICRUDService {
	public abstract ArrayList<Product> selectAllProducts();
	public abstract Product selectProduct(int id);
	public abstract void deleteProductByID(int id);
	public abstract void addNewProduct(Product product) throws Exception;
}