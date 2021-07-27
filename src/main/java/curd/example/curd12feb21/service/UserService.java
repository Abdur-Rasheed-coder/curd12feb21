package curd.example.curd12feb21.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curd.example.curd12feb21.domain.Contact;
import curd.example.curd12feb21.domain.User;

import curd.example.curd12feb21.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepository;
	public List<User> getAlluser()
	{
		return (List<User>) userrepository.findAll();
		
	}
	
	public Optional<User> getUserbyId(long id)
	{
		return userrepository.findById(id);
		
	}
	
	public void deleteUserbyId(long id)
	{
		 userrepository.deleteById(id);
		 
		
	}
	
	
	

}
