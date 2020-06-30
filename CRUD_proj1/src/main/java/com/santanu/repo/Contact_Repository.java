package com.santanu.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santanu.entity.Contact;

public interface Contact_Repository extends JpaRepository<Contact, Serializable> {

}
