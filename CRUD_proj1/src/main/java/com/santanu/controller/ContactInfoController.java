package com.santanu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.santanu.entity.Contact;
import com.santanu.service.ContactService;

@Controller
//@RequestMapping("/contact")

public class ContactInfoController {
	
	@Autowired
	private ContactService contactService;
	
	
	@GetMapping(value = { "/", "/addContact" })
	public String loadForm(Model model) {
		return null;
		
	}
	
	@PostMapping(value = "/storeContact")
	public String handleSubmitBtn(Contact c, Model model) {
		return null;
		
	}
	
	
	@GetMapping("/viewContacts")
	public String handleViewContactsLink(Model model) {
		return null;
		
	}
	
}
