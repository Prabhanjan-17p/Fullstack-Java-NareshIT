package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;


@Service
public class EmployeeIMPLService implements IEmployeeService {
	@Autowired
	private IEmployeeRepository repo;

	@Override
	public String saveEMP(Employee emp) {
		Employee emp1 = repo.save(emp);
		return "Data Saved id :: "+emp1.getId();
	}

	@Override
	public Employee findByEMPId(Integer id) {
		Optional<Employee> byId = repo.findById(id);
		return byId.orElse(null);
	}

	@Override
	public List<Employee> findAllEmp() {
		List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public String saveAllEmp(List<Employee> list) {
		List<Employee> saveAll = repo.saveAll(list);
		return "All Data Saved id :: "+saveAll;
	}

}
