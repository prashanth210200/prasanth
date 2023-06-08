package com.example.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeeServies {
	@Autowired
	EmployeeDao empldao;

	public List<Employee> getEmpGender(String gender) {
		List<Employee> allEmp = empldao.getList();
		List<Employee> result = allEmp.stream().filter(x -> x.getGender().equalsIgnoreCase(gender))
				.collect(Collectors.toList());
		return result;
	}

	public String addEmployee(Employee emp) {
		return empldao.addEmployee(emp);
	}

	public Employee getbyID(Integer id) {
		return empldao.getbyID(id);

	}

	public String deletebyID(@PathVariable Integer id) {
		return empldao.deletebyID(id);
	}

	public String addList(List<Employee> emp) {

		return empldao.addList(emp);
	}

	public List<Employee> getList() {
		return empldao.getList();
	}

	public String updateId(Employee id) {
		return empldao.updateId(id);

	}
	public Employee getmaxsalary(){
		
		List<Employee>maxSalary=empldao.getList();
		int max=maxSalary.get(0).getSalary();
		Employee temp=null;
		
		for(Employee x:maxSalary) {
			if(x.getSalary()>max) {
				temp=x;
				}
	}
	return temp;
	
	//	int m=empldao.getList().stream().max(((Employee) Comparator.comparing(Employee::getSalary)).toget();
		
	}
	public Employee getminiage() {
		Employee temp=null;
		List<Employee> age=empldao.getList();
		int mini=age.get(0).getAge();
		for(Employee x:age)
			if(x.getAge()<mini) {
				temp=x;
			}
	
return temp;
	}

	
public List<Integer> getListName(int age1,int age2){
	List<Employee> listname=empldao.getList();
	List<Integer> result=listname.stream().filter(x->x.getAge()>age1&&x.getAge()>age2).map(y->y.getId()).collect(Collectors.toList());
	return result;
}
public List<Integer>getid(String name){
	List<Employee>list=empldao.getList();
	List<Integer> results=list.stream().filter(x->x.getName().startsWith(name)).map(y->y.getId()).collect(Collectors.toList());
	return results;
}
public List<Employee>getbySalary(int salary1,int salary2){
	return  empldao.getbySalary(salary1,salary2);
}
	}
