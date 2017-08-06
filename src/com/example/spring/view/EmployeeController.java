package com.example.spring.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Employee;

@Controller
@RequestMapping("api")
public class EmployeeController {
	
	
	@RequestMapping(value = "/employee", method= RequestMethod.GET, produces = "application/json" )
	public @ResponseBody Employee getEmployee(Model model) {
		Employee emp = new Employee();
		emp.setEmail("Hello Fabrice");
		emp.setName("Fabrice");
		return emp;
	}

}
