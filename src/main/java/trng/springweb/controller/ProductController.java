package trng.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product")
public class ProductController {

	@RequestMapping(method = RequestMethod.GET)
	public String initloadForm() {
		return "addproduct";
	}
	
}
