package com.xa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xa.pojo.Dept;
import com.xa.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping("/depts")
	public List<Dept> getAllDepts(){
		
		return deptService.getAllDepts();
	}
	
}
