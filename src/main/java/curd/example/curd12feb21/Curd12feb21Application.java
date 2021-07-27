package curd.example.curd12feb21;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import curd.example.curd12feb21.domain.Contact;
import curd.example.curd12feb21.domain.User;
import curd.example.curd12feb21.repository.ContactRepository;
import curd.example.curd12feb21.repository.UserRepository;


@SpringBootApplication
public class Curd12feb21Application implements CommandLineRunner {
	
	@Autowired
	private UserRepository userrepository;
	@Autowired
    private ContactRepository contactrepo;
	public static void main(String[] args) {
		
		SpringApplication.run(Curd12feb21Application.class, args);		       
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1=new User();
	
		u1.setName("Abdul Rasheed");
		u1.setPassword("abdul");
		u1.setMob("9540845634");
		u1.setEmail("abdul@gmail.com");
		u1.setDob(new Date());
		u1.setMaker_date(new Date());
		
		FileInputStream fis=new FileInputStream("src/main/resources/images/rashid.jpg");
        byte[] data=new byte[fis.available()];
       fis.read(data);
       u1.setImgages(data);
       List<Contact> al=new ArrayList<Contact>();
       Contact c1=new Contact();
       
       c1.setCname("Atul");
       c1.setCemail("atul@gmail.com");
       c1.setUser(u1);
       Contact c2=new Contact();
      
       c2.setCname("Atul");
       c2.setCemail("atul@gmail.com");
       c2.setUser(u1);       
       al.add(c1);
       al.add(c2);
       u1.setContact(al);
       userrepository.save(u1);
       contactrepo.save(c1);
       contactrepo.save(c2);
      
       System.out.println("Successfully Save");
	}

		
	}

