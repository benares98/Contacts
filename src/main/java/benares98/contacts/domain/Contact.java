package benares98.contacts.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACTS")
public class Contact {
	private String name, address, phone, email;

	@Id
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
