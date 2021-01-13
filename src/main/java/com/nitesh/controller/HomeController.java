package com.nitesh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.nitesh.entity.Customer;
import com.nitesh.service.CustomerService;

@Controller
public class HomeController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")  
    public String home()  
    {  
        return "index";  
    }     
	
	@RequestMapping("/product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Nitesh kumar");
		return "product";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public RedirectView register(@ModelAttribute Customer customer, HttpServletRequest request) {
		Customer result = customerService.registerCustomer(customer);
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl(request.getContextPath()+ "/");
		return redirect;
	}

}
