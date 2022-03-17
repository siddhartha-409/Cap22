package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Department;
import com.demo.serviceipl.DepartmentServiceImp;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	
	@Autowired
	DepartmentServiceImp deptServImp;
	
	
	@PostMapping(value = "/adddepartmentdetails")
	public String addDepartmentDetails(@RequestBody Department dept) {
		Department d = deptServImp.addDepartmentDetails(dept);
		
		if(d!=null) {
			return "inserted successfully";
		}
		else {
			return "not inserted";
		}
	}

}
