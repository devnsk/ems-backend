package org.emp.ems_backend.employee.service;
import org.emp.ems_backend.employee.model.Employee;
import java.util.List;
import java.util.Optional;
public interface EmployeeService {

	String saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
//    Optional<Employee> getEmployeeById(Long id);
//    Employee updateEmployee(Long id, Employee employeeDetails);
//    void deleteEmployee(Long id);
}