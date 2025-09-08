package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeService {
	public String saveAllEmp(List<Employee> list);
	public String saveEMP(Employee emp);
	public Employee findByEMPId(Integer id);
	public List<Employee> findAllEmp();
}
