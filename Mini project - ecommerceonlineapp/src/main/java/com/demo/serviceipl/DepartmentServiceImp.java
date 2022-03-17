package com.demo.serviceipl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Department;
import com.demo.productrepository.DepartmentRepositary;
import com.demo.service.DepartmentService;


@Component
public class DepartmentServiceImp implements DepartmentService {
	
	@Autowired
	DepartmentRepositary deptRepos;

	@Override
	public Department addDepartmentDetails(Department dept) {
		return deptRepos.save(dept);
	}

}
