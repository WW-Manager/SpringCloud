package com.xa.dao;

import java.util.List;

import com.xa.pojo.Dept;

public interface DeptDao {

	List<Dept> getAllDepts();
	
	int deleteDept(int id);
	
	int insertDept(Dept dept);
	
	int updateDept(Dept dept);
}
