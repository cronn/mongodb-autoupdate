package de.cronn.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Access point for customer interactions.
 * 
 * @author Leandro Baltazar, cronn GmbH
 */
@Controller
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> getAllCustomers() {
		return repository.findAll();
	}
}
