package com.springproject.springproject;

import com.springproject.springproject.Rate.Rate;
import com.springproject.springproject.Repositories.employeeRep;
import com.springproject.springproject.Repositories.classEmployeeRepo;
import com.springproject.springproject.Repositories.rateRepo;

import com.springproject.springproject.classEmployee.Classemployee;
import com.springproject.springproject.employee.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class RepositoryTests {

    @Autowired private employeeRep employeeRepo;
    @Autowired private classEmployeeRepo classEmployeeRepo;
    @Autowired private rateRepo rateRepo;

    //testy pracownikow
    @Test
    public void testAddNewEmployee(){

        Employee e = new Employee();
        e.setImie("Franek");
        e.setNazwisko("Kimono");
        e.setStan("Obecny");
        e.setRok_uro(2002);
        e.setWynagrodzenie(5000.0);
        e.setClassemployeeId(1);
        Employee eSave = employeeRepo.save(e);

        Assertions.assertThat(eSave).isNotNull();
        Assertions.assertThat(eSave.getId()).isGreaterThan(0);

    }
    @Test
    public void testListAllEmployee(){
        Iterable<Employee> employees = employeeRepo.findAll();
        Assertions.assertThat(employees).hasSizeGreaterThan(0);

        for(Employee e : employees){
            System.out.println(e);
        }
    }

    @Test
    public void testDeleteEmployee(){
        Integer eId=7;
        employeeRepo.deleteById(eId);
        Optional<Employee> optionalEmployee = employeeRepo.findById(eId);
        Assertions.assertThat(optionalEmployee).isNotPresent();
    }


    //testy grup
    @Test
    public void testAddNewGroup(){

        Classemployee e = new Classemployee(null,3,"robotnicy");
        Classemployee eSave = classEmployeeRepo.save(e);

        Assertions.assertThat(eSave).isNotNull();
        Assertions.assertThat(eSave.getClassemployeeId()).isGreaterThan(0);

    }

    @Test
    public void testListAllGroup(){
        Iterable<Classemployee> classemployees = classEmployeeRepo.findAll();
        Assertions.assertThat(classemployees).hasSizeGreaterThan(0);

        for(Classemployee e : classemployees){
            System.out.println(e.getNazwaGrupy() + "     max_workers: " + e.getMaxLiczbaPracownikow());
        }
    }

    @Test
    public void testDeleteGroup(){
        Integer eId=7;
        classEmployeeRepo.deleteById(eId);
        Optional<Classemployee> optionalClassemployee = classEmployeeRepo.findById(eId);
        Assertions.assertThat(optionalClassemployee).isNotPresent();
    }

    //testy dla rate
    @Test
    public void testAddNewRate(){

        Rate rate = new Rate(null,3, "sprawni", 5);
        Rate rateSave = rateRepo.save(rate);

        Assertions.assertThat(rateSave).isNotNull();
        Assertions.assertThat(rateSave.getRateId()).isGreaterThan(0);

    }
}
