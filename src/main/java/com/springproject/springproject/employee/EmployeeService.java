package com.springproject.springproject.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.io.Writer;
import java.util.List;
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void addNewEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId){
        boolean x = employeeRepository.existsById(employeeId);
        if(!x){
            throw new IllegalStateException("employee with id" + employeeId + " doesnt exist");
        }
        employeeRepository.deleteById(employeeId);

    }

}

