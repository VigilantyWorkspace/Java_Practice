package com.santanu;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.santanu.entity.Product;
import com.santanu.service.CSVFileReader;

@SpringBootApplication
public class CsvFileReaderApplication {

	public static void main(String[] args) {
		CSVFileReader reader=null;
		List<Product> prodList=null;
		ConfigurableApplicationContext ctxt = SpringApplication.run(CsvFileReaderApplication.class, args);
		reader=ctxt.getBean(CSVFileReader.class);
		try {
			prodList=reader.readFile();
			prodList.forEach(prod->{
			
				System.out.print(prod.getProdId()+" ");
				System.out.print(prod.getProdName()+" ");
				System.out.print(prod.getProdPrice());
				System.out.println();
			});
		}catch(Exception e) {
			e.printStackTrace();

		}
		//close container
		ctxt.close();

	}
}
