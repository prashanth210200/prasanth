package com.example.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	
	
	
	
	


	public String addEmployee(Employee emp) {
		empRepo.save(emp);
		return "successfully saved";

	}

	public Employee getbyID(Integer id) {

		return empRepo.findById(id).get();

	}

	public String deletebyID(@PathVariable Integer id) {
		empRepo.deleteById(id);

		return "succesfull delete";
	}

	public String addList(List<Employee> emp) {
		
		 empRepo.saveAll(emp);
	
	return " new add all the value";
	}	
	public List<Employee> getList() {//-------->get list for services class
	return	empRepo.findAll();

	}

	public String updateId(Employee id) {
		empRepo.save(id);
		return "update was saved";
		
	}
	public  List<Employee> getmaxsalary() {
		return empRepo.findAll();
	}
	
	//query
	public List<Employee>getbySalary(int salary1,int salary2){
		return empRepo.getbySalary(salary1,salary2);
		
	}
}