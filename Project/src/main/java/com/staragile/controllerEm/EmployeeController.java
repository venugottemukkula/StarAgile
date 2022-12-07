package com.staragile.controllerEm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staragile.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") int employeeId) {
		Employee employee = new Employee();
		employee.setEmployeeId(1001);
		employee.setEmployeeName("venu");
		employee.setEmployeeSalary(20000.00);
		employee.setEmployeeAddress("Hyderabad");

		return employee;
	}

	@GetMapping("/emp")
	public String getEmployee() {
		return "Hello Employee";
	}
}
