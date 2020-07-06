package com.santanu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.santanu.dto.ContactDTO;
import com.santanu.service.ContactService;

@Controller
//@RequestMapping("/contact")

public class ContactInfoController {
	
	@Autowired
	private ContactService contactService;
	
	
	@GetMapping(value = { "/", "/addContact" })
	public String loadForm(Model model) {
		
		ContactDTO contactDTO = new ContactDTO();
		model.addAttribute("contact", contactDTO);
		return "contactInfo";
		
	}
	
	@PostMapping(value = "/storeContact")
	public String handleSubmitBtn(@ModelAttribute("contact")ContactDTO contactDTO, Model model) {
		
		boolean isSaved = contactService.saveContact(contactDTO);
		if(isSaved) {
			model.addAttribute("successMsg", "Contact Saved Successfully");
		}else {
			model.addAttribute("errorMsg", "Contact Saving Failed");
		}
		
		return "contactInfo";
	}
	
	
	@GetMapping("/viewContacts")
	public String handleViewContactsLink(Model model) {
		List<ContactDTO> contactListDTO =contactService.getAllContacts();
		model.addAttribute("contactDetailsList",contactListDTO);
		
		return "viewContacts";
		
	}
	
}
