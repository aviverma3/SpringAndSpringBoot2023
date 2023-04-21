package com.springboot;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@EnableAutoConfiguration
@ComponentScan
@Configurable*/
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootBackendApplication.class, args);

	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setFirstName("Ravi");
		emp1.setLastName("Verma");
		emp1.setEmailId("avinash3.verma@gmail.com");
		employeeRepository.save(emp1);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setFirstName("Rock");
		emp2.setLastName("Cena");
		emp2.setEmailId("john.cena@gmail.com");
		employeeRepository.save(emp2);

	}
}
