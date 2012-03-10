package benares98.contacts.dao;

import java.util.List;

import benares98.contacts.domain.Contact;

public interface ContactDAO {
	public void saveContact(Contact contact);
	public Contact readContact(String name);
	public void updateContact(Contact contact);
	public void deleteContact(Contact contact);
	public List<Contact> listNames();
}
