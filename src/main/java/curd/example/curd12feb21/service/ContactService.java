package curd.example.curd12feb21.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curd.example.curd12feb21.domain.Contact;
import curd.example.curd12feb21.repository.ContactRepository;

@Service
public class ContactService {

@Autowired
ContactRepository contactrepository;

public List<Contact> getAllContact()
{
return (List<Contact>)contactrepository.findAll();

}
/*
public  Optional<Contact> getContactByUserId(Long userid)
{
	return contactrepository.findById(userid);
}
*/



}
