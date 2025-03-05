package org.emp.ems_backend.employee.repository;

import org.emp.ems_backend.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Insert Employee
    public int save(Employee employee) {
        String sql = "INSERT INTO Ems_Employee (emp_id, emp_name, emp_email, gender, address, emp_department_id, phoneNo, dob) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, employee.getEmpId(), employee.getEmpName(), employee.getEmpEmail(),
                employee.getGender(), employee.getAddress(), employee.getEmpDepartmentId(),
                employee.getPhoneNo(), employee.getDob());
    }

    // Get All Employees
    public List<Employee> findAll() {
        String sql = "SELECT * FROM Ems_Employee";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Employee(
                        rs.getLong("emp_id"),
                        rs.getString("emp_name"),
                        rs.getString("emp_email"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getLong("emp_department_id"),
                        rs.getString("phoneNo"), // Fix: Change from getLong to getString
                        rs.getDate("dob") != null ? rs.getDate("dob").toLocalDate() : null // Fix: Convert dob to LocalDate
                )
        );
    }

    // Get Employee By ID
    public Optional<Employee> findById(Long id) {
        String sql = "SELECT * FROM Ems_Employee WHERE emp_id = ?";
        List<Employee> employees = jdbcTemplate.query(sql, (rs, rowNum) ->
                new Employee(
                        rs.getLong("emp_id"),
                        rs.getString("emp_name"),
                        rs.getString("emp_email"),
                        rs.getString("gender"),
                        rs.getString("address"),
                        rs.getLong("emp_department_id"),
                        rs.getString("phoneNo"), // Fix: Change from getLong to getString
                        rs.getDate("dob") != null ? rs.getDate("dob").toLocalDate() : null // Fix: Convert dob to LocalDate
                ), id
        );

        return employees.stream().findFirst();
    }

    // Update Employee
    public int update(Employee employee) {
        String sql = "UPDATE Ems_Employee SET emp_name = ?, emp_email = ?, gender = ?, address = ?, emp_department_id = ?, phoneNo = ?, dob = ? WHERE emp_id = ?";
        return jdbcTemplate.update(sql, employee.getEmpName(), employee.getEmpEmail(), employee.getGender(),
                employee.getAddress(), employee.getEmpDepartmentId(), employee.getPhoneNo(),
                employee.getDob(), employee.getEmpId());
    }

    // Delete Employee
    public int delete(Long id) {
        String sql = "DELETE FROM Ems_Employee WHERE emp_id = ?";
        return jdbcTemplate.update(sql, id);
    }
}