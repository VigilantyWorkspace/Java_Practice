package com.santanu.dto;

import java.io.Serializable;
import java.util.Date;

import com.santanu.entity.Contact;

import lombok.Data;

@Data
public class Contact_DTO implements Serializable {
	
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNumber;
	private Date createdDate;
	private Date updatedDate;
}
