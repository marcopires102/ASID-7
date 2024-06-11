package com.grupo7.parentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo7.parentservice.model.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
