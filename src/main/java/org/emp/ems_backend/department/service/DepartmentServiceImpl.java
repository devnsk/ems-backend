package org.emp.ems_backend.department.service;

import org.emp.ems_backend.department.model.Department;
import org.emp.ems_backend.department.repository.DepartmentRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    //  Constructor-based dependency injection
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public String addDepartment(Department department) {
        int result = departmentRepository.save(department);
        return (result > 0) ? "Department added successfully!" : "Failed to add department!";
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }






}
