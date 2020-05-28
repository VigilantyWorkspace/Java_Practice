package com.santanu.service;

import java.util.List;

import com.santanu.dto.ProductDTO;
import com.santanu.entity.Product;

public interface ProductsDataService {
	
	public List<ProductDTO> FetchProductData()throws Exception;
	
	
}
