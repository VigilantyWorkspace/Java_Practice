package com.santanu.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.santanu.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Serializable> {

}
