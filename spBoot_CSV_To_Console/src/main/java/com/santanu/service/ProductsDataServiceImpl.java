package com.santanu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.santanu.dto.ProductDTO;
import com.santanu.entity.Product;
import com.santanu.repo.ProductRepo;

/*public class ProductsDataServiceImpl implements ProductsDataService {
	
	@Autowired
	private  ProductRepo productRepo;
	

	@Override
	public List<StudentDTO> fetchAllStudents() {
		Iterable<Student> it;
		List<StudentDTO> listDTO=new ArrayList();
		//use repo
		  it=studentRepo.findAll();
		  
		  it.forEach(entity->{
			  StudentDTO dto=new StudentDTO();
			  BeanUtils.copyProperties(entity, dto);
			  listDTO.add(dto);
		  });
		  return listDTO;
	}

	
}*/
