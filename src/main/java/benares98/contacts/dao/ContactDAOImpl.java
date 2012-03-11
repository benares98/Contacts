package benares98.contacts.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import benares98.contacts.domain.Contact;

public class ContactDAOImpl implements ContactDAO {

	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory){this.hibernateTemplate = new HibernateTemplate(sessionFactory);}
	
	public void saveContact(Contact contact) {hibernateTemplate.saveOrUpdate(contact);}

	public Contact readContact(String name) {return (Contact) hibernateTemplate.find("from Contact where name=", name).get(0);}

	public void updateContact(Contact contact) {hibernateTemplate.update(contact);}

	public void deleteContact(Contact contact) {hibernateTemplate.delete(contact);}

	public List<Contact> listNames() {return hibernateTemplate.find("from Contact order by NAME");}

}
