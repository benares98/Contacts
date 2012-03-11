package benares98.contacts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import benares98.contacts.dao.ContactDAO;
import benares98.contacts.domain.Contact;

@Controller
public class ContactsController{
	private ContactDAO contactDAO;

	public void setContactDAO(ContactDAO contactDAO) {this.contactDAO = contactDAO;}
	/*
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response, Contact contact){
		contactDAO.saveContact(contact);
		return new ModelAndView("redirect:list.htm");
	}
	
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response, Contact contact){
		contactDAO.saveContact(contact);
		ModelAndView modelAndView = list(request, response);
		modelAndView.getModelMap().addAttribute("contact", contact);
		return modelAndView;
	}
	
	public ModelAndView save(HttpServletRequest request, HttpServletResponse response, Contact contact){
		contactDAO.saveContact(contact);
		ModelAndView modelAndView = list(request, response);
		modelAndView.getModelMap().addAttribute("contact", contact);
		return modelAndView;
	}
	
	@RequestMapping(value="/contact/edit/{contactName}")
	public ModelAndView readContact(@PathVariable("contactName") String contactName){
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("contact", contactDAO.readContact(contactName));
		return new ModelAndView("contactsForm", modelMap);
	}*/
	
	@RequestMapping(value="/lists.htm")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response){
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("contactList", contactDAO.listNames());
		modelMap.addAttribute("contact", new Contact());
		return new ModelAndView("contactsForm", modelMap);
	}
}
