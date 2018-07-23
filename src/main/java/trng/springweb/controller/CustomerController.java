package trng.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trng.springweb.model.Customer;
import trng.springweb.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
   @Autowired
   CustomerService cserv;
   
   @RequestMapping(method = RequestMethod.GET)
	public String initloadForm() {
		return "addcustomer";
	}
   
   @RequestMapping(value="/list", method=RequestMethod.GET)
	public String loadCustomerList() {
		return "customerlist";
	}
}
