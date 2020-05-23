package com.ibsplc.com.payroll.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int eid;
	private String empName;
	private int salary;

	public Employee() {

	}

	public Employee(String empName, int salary) {
		this.empName = empName;
		this.salary = salary;
	}

}
