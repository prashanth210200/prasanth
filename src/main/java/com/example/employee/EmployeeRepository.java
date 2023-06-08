package com.example.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value="select*from employee Where salary>=? and salary>=?",nativeQuery=true)
			 public List<Employee>getbySalary(int salary1,int salary2);

}
