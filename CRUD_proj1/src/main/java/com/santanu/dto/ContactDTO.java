package com.santanu.dto;

import java.io.Serializable;
import java.util.Date;


import lombok.Data;

@Data
public class ContactDTO implements Serializable {
	
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNumber;
	private Date createdDate;
	private Date updatedDate;
}
