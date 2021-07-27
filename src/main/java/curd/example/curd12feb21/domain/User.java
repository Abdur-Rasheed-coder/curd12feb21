package curd.example.curd12feb21.domain;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_m")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
   @Column(name="user_name",nullable=false)
   private String name;
	
    @Column(nullable=false)
	private String password;
	
	@Column(name="user_mob")
	private String mob;
	
	@Column(nullable=true)
	private String email;
	
	@Basic(optional=false)
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	
	
	@Basic(optional=false)
	@Temporal(TemporalType.DATE)
	private Date maker_date;

	@Lob
	private byte[] imgages;
	
	
	@OneToMany(mappedBy="user")
	private List<Contact> contact;
	
	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getMaker_date() {
		return maker_date;
	}

	public void setMaker_date(Date maker_date) {
		this.maker_date = maker_date;
	}

	public byte[] getImgages() {
		return imgages;
	}

	public void setImgages(byte[] imgages) {
		this.imgages = imgages;
	}

		

}
