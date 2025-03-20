package com.springproject.springproject.classEmployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class classEmployeeService {
    private final classEmployeeRepository classEmployeeRepository;

    @Autowired
    public classEmployeeService(classEmployeeRepository classEmployeeRepository) {
        this.classEmployeeRepository = classEmployeeRepository;
    }

    public List<Classemployee> getGroups() {
        return classEmployeeRepository.findAll();
    }

    public void addNewGroup(Classemployee classemployee) {
        System.out.println(classemployee);
        classEmployeeRepository.save(classemployee);
    }

    public void deleteGroup(Long classEmployeeId) {
        boolean x = classEmployeeRepository.existsById(classEmployeeId);
        if (!x) {
            throw new IllegalStateException("group with id" + classEmployeeId + " doesnt exist");
        }
        classEmployeeRepository.deleteById(classEmployeeId);
    }
}
