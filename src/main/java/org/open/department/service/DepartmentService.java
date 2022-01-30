package org.open.department.service;

import lombok.extern.slf4j.Slf4j;
import org.open.department.entity.Department;
import org.open.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(long departmentId) {
        log.info("Inside findDepartmentById method");
        return departmentRepository.findById(departmentId)
                .orElse(new Department());
    }
}
