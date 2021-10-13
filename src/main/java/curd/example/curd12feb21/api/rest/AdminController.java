package curd.example.curd12feb21.api.rest;

import java.util.List1;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import curd.example.curd12feb21.domain.Contact;
import curd.example.curd12feb21.service.ContactService;

@RestController
public class AdminController {
@Autowired
ContactService contactservice;
@GetMapping("api/contact")
public List<Contact> getAllContact()
{
return (List<Contact>)contactservice.getAllContact();
}



}
