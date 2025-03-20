package com.springproject.springproject.employee;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeservice){
        this.employeeService = employeeservice;
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping
    public void addNewEmployee(@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
    }

    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee( @PathVariable("employeeId") Long employeeId){
        employeeService.deleteEmployee(employeeId);
    }
/*
    @RequestMapping("/csv")
    public void getAllEmployeesInCsv(HttpServletResponse servletResponse) throws IOException {
        servletResponse.setContentType("text/csv");
        servletResponse.addHeader("Content-Disposition","attachment; filename=\"employees.csv\"");
       // employeeService.writeEmployeesToCsv(servletResponse.getWriter());
    }
*/

}

