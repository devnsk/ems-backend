package org.emp.ems_backend.employee.service;

import org.emp.ems_backend.employee.model.Employee;
import org.emp.ems_backend.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
//import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String saveEmployee(Employee employee) {
        int result = employeeRepository.saveEmployee(employee);
        return (result > 0) ? "Department added successfully!" : "Failed to add department!";
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

//    @Override
//    public Optional<Employee> getEmployeeById(Long id) {
//        return employeeRepository.findById(id);
//    }

//    @Override
//    public Employee updateEmployee(Long id, Employee employeeDetails) {
//        return employeeRepository.findById(id).map(employee -> {
//            employee.setName(employeeDetails.getName());
//            employee.setEmail(employeeDetails.getEmail());
//            employee.setDepartment(employeeDetails.getDepartment());
//            return employeeRepository.save(employee);
//        }).orElseThrow(() -> new RuntimeException("Employee not found"));
//    }

//    @Override
//    public void deleteEmployee(Long id) {
//        employeeRepository.deleteById(id);
//    }
}


