package trng.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trng.springweb.model.Customer;
import trng.springweb.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
   @Autowired
   CustomerService cserv;
   
   @RequestMapping(value="/{customerId}", method=RequestMethod.GET)
   public Customer loadCustomer(@PathVariable("customerId") int customerId) {
		return cserv.loadCustomer(customerId);
	}
}
