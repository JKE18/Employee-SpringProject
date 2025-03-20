package com.springproject.springproject.classEmployee;

import com.springproject.springproject.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/group")
public class classEmployeeController {
    private final classEmployeeService classEmployeeService;

    @Autowired
    public classEmployeeController(classEmployeeService classEmployeeService){
        this.classEmployeeService=classEmployeeService;
    }

    @GetMapping
    public List<Classemployee> getGroups(){
        return classEmployeeService.getGroups();
    }

    @PostMapping
    public void addNewGroup(@RequestBody Classemployee classemployee){
        classEmployeeService.addNewGroup(classemployee);
    }

    @DeleteMapping(path = "{classEmployeeId}")
    public void deleteGroup(@PathVariable("classEmployeeId") Long classEmployeeId){
        classEmployeeService.deleteGroup(classEmployeeId);
    }

}
