package benares98.contacts.web;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import benares98.contacts.dao.ContactDAO;

public class ContactsController extends MultiActionController {
	private ContactDAO contactDAO;

	public void setContactDAO(ContactDAO contactDAO) {this.contactDAO = contactDAO;}
}
