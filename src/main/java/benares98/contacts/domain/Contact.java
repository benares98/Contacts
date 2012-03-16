package benares98.contacts.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="CONTACT")
@Proxy(lazy=false)
public class Contact {
	private String name, address, phone, email;
	private long id;

	@Id
	@GeneratedValue
	@Column(name="ID")
	public long getId(){return id;}
	public void setId(long id){this.id = id;}
	
	@Column(name="NAME")
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@Column(name="ADDRESS")
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}

	@Column(name="PHONE")
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}

	@Column(name="EMAIL")
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
}
