package com.grupo7.parentservice.service;

import com.grupo7.parentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo7.parentservice.model.entity.Department;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    public Department findDepartmentById(Long departmentID) {
        return departmentRepository.findById(departmentID).orElseThrow();
    }
}
