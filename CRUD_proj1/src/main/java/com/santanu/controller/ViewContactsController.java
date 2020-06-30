package com.santanu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.santanu.entity.Contact;
import com.santanu.service.ContactService;

@Controller
//@RequestMapping("/edit_contact")
public class ViewContactsController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/editContact")
	public String editContact(@RequestParam("contactId") Integer contactId) {
		return null;

	}
	
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updateContact(@ModelAttribute Contact c, Model model) {
		return null;

	}
	
	@RequestMapping("/deleteContact")
	public String deleteContact(@RequestParam("contactId") Integer contactId) {
		return null;

	}
}
