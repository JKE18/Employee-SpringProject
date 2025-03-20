package com.springproject.springproject.Repositories;

import com.springproject.springproject.employee.Employee;
import org.springframework.data.repository.CrudRepository;

public interface employeeRep extends CrudRepository<Employee,Integer> {
}
