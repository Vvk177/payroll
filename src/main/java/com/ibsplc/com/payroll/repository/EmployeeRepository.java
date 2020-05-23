package com.ibsplc.com.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibsplc.com.payroll.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
