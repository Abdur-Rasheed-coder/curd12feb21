package curd.example.curd12feb21.api.rest;

/* This is user Controller */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import curd.example.curd12feb21.domain.Contact;
import curd.example.curd12feb21.domain.User;
import curd.example.curd12feb21.repository.UserRepository;
import curd.example.curd12feb21.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	
	@GetMapping("api/users")
	public List<User> getAlluser()
	{
		return (List<User>) userrepository.findAll();
		
	}
	@GetMapping("api/user/{id}")
	public Optional<User> getUserbyId(@PathVariable long id)
	{
		return userrepository.findById(id);
		
	}
	
	@DeleteMapping("api/delete/{id}")
	public void deleteUser(@PathVariable long id)
	{
		 userrepository.deleteById(id);
	}
	
	@PostMapping("api/adduser" )
	public void createUser(User user)
	{		
		userrepository.save(user);
	}
	
	
	

}
