package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
@Controller
public class CustomerController {
    @Autowired
    ConfigurableApplicationContext context;


    @RequestMapping("/customers")
    public String customers(@RequestParam(value = "name", required = false) String name, Model model) {
        CustomerRepository repository = context.getBean(CustomerRepository.class);
        Iterable<Customer> customers = null;
        if (name == null) {
            // fetch all customers
            customers = repository.findAll();
        } else {
            // fetch customers by last name
            customers = repository.findByLastName(name);
        }
        model.addAttribute("customers", customers);
//        return customers;
        return "customers";
    }
}
