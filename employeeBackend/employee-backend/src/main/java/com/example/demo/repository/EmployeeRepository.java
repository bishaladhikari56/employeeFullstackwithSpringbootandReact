package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Employee;
//ctrl +o to open the JpaRepository

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
