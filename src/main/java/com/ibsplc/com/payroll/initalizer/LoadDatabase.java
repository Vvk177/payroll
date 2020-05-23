package com.ibsplc.com.payroll.initalizer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibsplc.com.payroll.model.Employee;
import com.ibsplc.com.payroll.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
		return args -> {
			log.info("preloading" + employeeRepository.save(new Employee("vivek singh", 23000)));
		};

	}

}
