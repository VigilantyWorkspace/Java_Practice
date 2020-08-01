package com.santanu.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santanu.dto.ContactDTO;
import com.santanu.entity.ContactEntity;
import com.santanu.repo.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public boolean saveContact(ContactDTO contactDTO) {
		ContactEntity contactEntity = new ContactEntity();
		
		
		
		BeanUtils.copyProperties(contactDTO, contactEntity);
		ContactEntity savedContactEntity = contactRepo.save(contactEntity);
		return savedContactEntity.getContactId() != null;
	
	}

	@Override
	public List<ContactDTO> getAllContacts() {
		
		List<ContactEntity> fetchedContacts = contactRepo.findAll();
		List<ContactDTO> contactListDTO = new ArrayList<ContactDTO>();
		
		for(ContactEntity contactEntity :fetchedContacts) {
			ContactDTO  contactDTO = new ContactDTO();
			BeanUtils.copyProperties(contactEntity,contactDTO);
			contactListDTO.add(contactDTO);
		}
		
		return contactListDTO;
	}

	@Override
	public ContactDTO getContactById(Integer cid) {
		
		 Optional<ContactEntity> contactById = contactRepo.findById(cid);
		
		if(contactById.isPresent()) {
			
			ContactEntity contactEntity = contactById.get();
			ContactDTO  contactDTO = new ContactDTO();
			BeanUtils.copyProperties(contactEntity,contactDTO);
			return contactDTO;
		}
		return null;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		
		contactRepo.deleteById(cid);
		
		return true;
	}
}