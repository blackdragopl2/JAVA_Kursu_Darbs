package com.kurss.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.kurss.demo.model.Product;

public interface IProductRepo extends CrudRepository<Product, Integer>{

}
