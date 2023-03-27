package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceimpl implements ContactService {
//Created Dummy Data
	List<Contact>list=List.of(
			
			new Contact(1L,"mhaku@gmail.com","mhaku",101L),
			new Contact(2L,"sachin@gmail.com","sachin",102L),
			new Contact(4L,"chaitanya@gmail.com","chaitanya",103L));
	
	@Override
	public List<Contact> getContactOfUser(Long userID) {
		
		return list.stream().filter(cont->cont.getUserId().equals(userID)).collect(Collectors.toList());
	}

}
