package curd.example.curd12feb21.api.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@Autowired
ContactService contactservice;
@GetMapping("api/test")
public List<Contact> getAllTest()
{
return (List<Contact>)contactservice.getAllTest();
}



}
