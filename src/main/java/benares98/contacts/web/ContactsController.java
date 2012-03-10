package benares98.contacts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import benares98.contacts.dao.ContactDAO;
import benares98.contacts.domain.Contact;

public class ContactsController extends MultiActionController {
	private ContactDAO contactDAO;

	public void setContactDAO(ContactDAO contactDAO) {this.contactDAO = contactDAO;}
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response, Contact contact){
		contactDAO.saveContact(contact);
		return new ModelAndView("redirect:list.htm");
	}
	
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response, Contact contact){
		contactDAO.deleteContact(contact);
		return new ModelAndView("redirect:list.htm");
	}
	
	public ModelAndView save(HttpServletRequest request, HttpServletResponse response, Contact contact){
		contactDAO.saveContact(contact);
		ModelAndView modelAndView = list(request, response);
		modelAndView.getModelMap().addAttribute("contact", contact);
		return modelAndView;
	}
	
	public ModelAndView read(HttpServletRequest request, HttpServletResponse response, String name){
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("contact", contactDAO.readContact(name));
		return new ModelAndView("viewContactForm", modelMap);
	}
	
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response){
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("contactList", contactDAO.listNames());
		modelMap.addAttribute("contact", new Contact());
		return new ModelAndView("contactsForm", modelMap);
	}
}
