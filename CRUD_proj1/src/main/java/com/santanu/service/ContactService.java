package com.santanu.service;

import java.util.List;

import com.santanu.dto.ContactDTO;

public interface ContactService {
	
	boolean saveContact(ContactDTO contactDTO);
	
	List<ContactDTO> getAllContacts( );
	
	ContactDTO getContactById(Integer cid);
	
	
	
	boolean deleteContact(Integer cid);
}
