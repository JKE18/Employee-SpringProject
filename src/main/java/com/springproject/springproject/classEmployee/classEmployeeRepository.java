package com.springproject.springproject.classEmployee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface classEmployeeRepository extends JpaRepository<Classemployee, Long> {

}
