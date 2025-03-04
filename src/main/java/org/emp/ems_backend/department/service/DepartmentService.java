package org.emp.ems_backend.department.service;

import org.emp.ems_backend.department.model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    String addDepartment(Department department);
    List<Department> getAllDepartments();
//    Optional<Department> getDepartmentById(Long id);
//    String updateDepartment(Long id, Department department);
//    String deleteDepartment(Long id);


}
