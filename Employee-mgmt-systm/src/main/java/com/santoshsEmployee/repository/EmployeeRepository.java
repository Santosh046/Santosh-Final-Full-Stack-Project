package com.santoshsEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santoshsEmployee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
