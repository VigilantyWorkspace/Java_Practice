package com.santanu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santanu.entity.Contact;
import com.santanu.repo.Contact_Repository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private Contact_Repository contactRepo;
	
	@Override
	public boolean saveContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
