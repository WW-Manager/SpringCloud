package com.xa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.dao.DeptDao;
import com.xa.pojo.Dept;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public List<Dept> getAllDepts() {
		return deptDao.getAllDepts();
	}

	

}
