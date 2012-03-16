package benares98.contacts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import benares98.contacts.dao.ContactDAO;
import benares98.contacts.domain.Contact;

@Controller
public class ContactsController{
	private ContactDAO contactDAO;

	public void setContactDAO(ContactDAO contactDAO) {this.contactDAO = contactDAO;}
	
	@RequestMapping(value="**/add.htm")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response, Contact contact){
		contactDAO.saveContact(contact);
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("contactList", contactDAO.listNames());
		modelMap.addAttribute("contact", contact);
		return new ModelAndView("contactsForm", modelMap);
	}
	
	@RequestMapping(value="**/delete.htm")
	public ModelAndView delete(@RequestParam(value="delName", required=true) Long id){
		contactDAO.deleteContact(contactDAO.readContact(id));
		return new ModelAndView("redirect:lists.htm");
	}
	
	/*
	public ModelAndView save(HttpServletRequest request, HttpServletResponse response, Contact contact){
		contactDAO.saveContact(contact);
		ModelAndView modelAndView = list(request, response);
		modelAndView.getModelMap().addAttribute("contact", contact);
		return modelAndView;
	}*/
	
	@RequestMapping(value="**/{contactName}.htm")
	public ModelAndView readContact(@PathVariable("contactName") Long id){
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("contact", contactDAO.readContact(id));
		modelMap.addAttribute("contactList", contactDAO.listNames());
		return new ModelAndView("contactsForm", modelMap);
	}
	
	@RequestMapping(value="**/lists.htm")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response){
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("contactList", contactDAO.listNames());
		modelMap.addAttribute("contact", new Contact());
		return new ModelAndView("contactsForm", modelMap);
	}
}
