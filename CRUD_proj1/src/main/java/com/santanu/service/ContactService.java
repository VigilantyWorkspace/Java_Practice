package com.santanu.service;

import java.util.List;

import com.santanu.entity.Contact;

public interface ContactService {
	
	boolean saveContact(Contact c);
	List<Contact> getAllContacts( );
	Contact getContactById(Integer cid);
	boolean updateContact(Contact c);
	boolean deleteContact(Integer cid);
}
