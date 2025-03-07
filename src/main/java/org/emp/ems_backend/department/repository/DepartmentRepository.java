package org.emp.ems_backend.department.repository;

import org.emp.ems_backend.department.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DepartmentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Insert Department
    public int save(Department department) {
        String sql = "INSERT INTO Ems_Department (deprt_name, deprt_description) VALUES (?, ?)";
        return jdbcTemplate.update(sql, department.getDeprtName(), department.getDeprtDescription());
    }

    // Get All Departments
    public List<Department> findAll() {
        String sql = "SELECT * FROM Ems_Department";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Department(
                        rs.getLong("deprt_id"),
                        rs.getString("deprt_name"),
                        rs.getString("deprt_description")
                )
        );
    }

    // Get Department By ID
    public Optional<Department> findById(Long id) {
        String sql = "SELECT * FROM ems_department WHERE deprt_id = ?"; // Use lowercase table name
        List<Department> departments = jdbcTemplate.query(sql, (rs, rowNum) ->
                new Department(
                        rs.getLong("deprt_id"),
                        rs.getString("deprt_name"),
                        rs.getString("deprt_description")
                ), id
        );

        return departments.stream().findFirst();
    }


    // Update Department
    public int update(Department department) {
        String sql = "UPDATE Ems_Department SET deprt_name = ?, deprt_description = ? WHERE deprt_id = ?";
        return jdbcTemplate.update(sql, department.getDeprtName(), department.getDeprtDescription(), department.getDeprtId());
    }

    // Delete Department
    public int delete(Long id) {
        String sql = "DELETE FROM Ems_Department WHERE deprt_id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
