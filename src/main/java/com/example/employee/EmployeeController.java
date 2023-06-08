package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {
	@Autowired
	EmployeeServies empse;

	@GetMapping(value = "/getEmpGender/{gender}")
	public List<Employee> getEmpGender(@PathVariable String gender) {
		return empse.getEmpGender(gender);
	}

	@PostMapping(value = "/add")
	public String addEmployee(@RequestBody Employee emp) {
		return empse.addEmployee(emp);
	}

	@GetMapping(value = "/getid/{id}")
	public Employee getbyID(@PathVariable Integer id) {
		return empse.getbyID(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deletebyID(@PathVariable Integer id) {
		return empse.deletebyID(id);
	}

	@PostMapping(value = "/addlist")
	public String addList(@RequestBody List<Employee> emp) {
		return empse.addList(emp);
	}

	@GetMapping(value = "/getlist")
	public List<Employee> getList() {
		return empse.getList();
	}

	@PutMapping(value = "/update/{id}")
	public String updateId(@RequestBody Employee id) {
		return empse.updateId(id);

	}
	@GetMapping(value="/getmaxsalary")
	public Employee getmaxsalary(){
	 return   empse.getmaxsalary();
	}
	@GetMapping(value="/getminiage")
	public Employee getmini() {
		return empse.getminiage();
	}
@GetMapping(value="/getname")
public List<Integer> getListName(@PathVariable int age1,@PathVariable int  age2){
	return  empse.getListName(24, 25);
}
@GetMapping(value="/getid")
public List<Integer> getid(@PathVariable String name){
	
	return empse.getid(name);
}

//sql query value
@GetMapping (value="/getbySalary/{salary1}/{salary2}")
public List<Employee>getbySalary(@PathVariable int salary1,@PathVariable int salary2){
	return empse.getbySalary(salary1,salary2);
	
}
}
	
	


