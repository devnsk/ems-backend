package org.emp.ems_backend.employee.repository;

import org.emp.ems_backend.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EmployeeRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveEmployee(Employee employee) {
        String sql = "INSERT INTO Ems_Department (empId, name, gender, dob, email, phoneNo, address, deptId) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, employee.getName(), employee.getEmail());
    }

    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Employee(
                        rs.getLong("empid"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getLong("deptId"),
                        rs.getLong("phoneNo"),
                        rs.getLong("dob")
                        
                	));
                
    }
}
