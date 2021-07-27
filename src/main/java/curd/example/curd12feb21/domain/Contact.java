package curd.example.curd12feb21.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contact_m")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="c_name",nullable=false)
	private String cname;
	
	@Column(name="c_email",nullable=false)
	private String cemail;
	
	@ManyToOne
    private User user;
    


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCemail() {
		return cemail;
	}


	public void setCemail(String cemail) {
		this.cemail = cemail;
	}


	
}
