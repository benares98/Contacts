package benares98.contacts.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import benares98.contacts.domain.Contact;

public class ContactDAOImpl implements ContactDAO {

	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory){this.hibernateTemplate = new HibernateTemplate(sessionFactory);}
	
	public void saveContact(Contact contact) {hibernateTemplate.saveOrUpdate(contact);}

	public Contact readContact(String name) {return (Contact) hibernateTemplate.get("Contact", name);}

	public void updateContact(Contact contact) {hibernateTemplate.update(contact);}

	public void deleteContact(Contact contact) {hibernateTemplate.delete(contact);}

	public List<String> listNames() {return hibernateTemplate.findByNamedParam("select name from contacts", "", null);}

}
