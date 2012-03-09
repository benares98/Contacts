package benares98.contacts.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import benares98.contacts.domain.Contact;

public class ContactDAOImpl implements ContactDAO {

	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	public void saveContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	public Contact readContact(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	public void deleteContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	public List<String> listNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
