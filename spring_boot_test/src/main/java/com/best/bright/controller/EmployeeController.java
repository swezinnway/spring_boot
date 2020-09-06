package com.best.bright.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.best.bright.model.Employee;
import com.best.bright.repository.EmployeeRepository;



@Controller
public class EmployeeController {
	
@Autowired
private EmployeeRepository employeeRepository;

@PostMapping(path="/add") // Map ONLY POST Requests
public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email,@RequestParam int age,@RequestParam String phoneno,@RequestParam String address,@RequestParam String gender) {
  // @ResponseBody means the returned String is the response, not a view name
  // @RequestParam means it is a parameter from the GET or POST request

  Employee e = new Employee();
  e.setName(name);
  e.setEmail(email);
  e.setAge(age);
  e.setPhoneno(phoneno);
  e.setAddress(address);
  e.setGender(gender);
  
  employeeRepository.save(e);
  return "Saved";
}

@GetMapping("/create")
public String create(Model model) {
	model.addAttribute("employee", new Employee());
	return "new_employee";
}
@GetMapping("/employees")
public @ResponseBody List<Employee> getemployeeList(){
	return employeeRepository.findAll();
}

@PostMapping("/save_Employee")
public String saveEmployee(@ModelAttribute("employee")Employee emp,Model model) {
	
	employeeRepository.save(emp);
	
	model.addAttribute("employees",employeeRepository.findAll());
	return "employee_list";
}

@GetMapping("/ajax_save")
public String ajax_save() {
	return "ajax_save";
}
@PostMapping("/ajax_save")
public @ResponseBody Employee save_employee(@RequestBody Employee emp) {
	Employee employee=employeeRepository.save(emp);
	return employee;
}
@GetMapping(path="/call")
public @ResponseBody String test() {
	return "Hello Test";
}

}
