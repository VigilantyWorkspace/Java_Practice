package com.santanu.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;
import com.santanu.dto.ProductDTO;
import com.santanu.entity.Product;
import com.santanu.repo.ProductRepo;


/*
 * Using opencsv API
 */
@Component
public class CsvFileReaderImpl implements CSVFileReader {
	
	@Autowired
	private  ProductRepo productRepo;
	
	@SuppressWarnings("resource")
	public List<Product> readFile() throws IOException{
		List<Product> prodList=null;
		CSVReader reader=null;
		String[] items=null;
		//create CsvReader object
		reader=new CSVReader(new FileReader("E:/products.csv"));
		//create one LIst to hold the products
		prodList=new LinkedList<>();
		while((items=reader.readNext())!=null) {
			//creating one product object per one row of csv file
			Product prod=new Product();
			prod.setProdId(Integer.valueOf(items[0]));
			prod.setProdName(items[1]);
			prod.setProdPrice(Float.valueOf(items[2]));
			
			productRepo.save(prod);
			
			prodList.add(prod);
		}
		if(prodList !=null) {
			System.out.println("Data Inserted");
		}
		return prodList;
	}

}
