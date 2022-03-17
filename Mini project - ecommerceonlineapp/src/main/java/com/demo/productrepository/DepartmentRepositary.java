package com.demo.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Department;

public interface DepartmentRepositary extends JpaRepository<Department, Long> {

}
