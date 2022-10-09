package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.CollegeRepository;
import com.example.demo.entity.College;


public class CollegeServiceImpl implements CollegeService {
	@Autowired
	CollegeRepository dao;
	@Override
	public List<College> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public College findById(int studentID) {
		// TODO Auto-generated method stub
		Optional<College>c= dao.findById(studentID);
		College c1=null;
		if(c==null)
		{
			c1=c.get();
		}
		return c1;
	}

	@Override
	public void saveorUpdate(College c) {
		// TODO Auto-generated method stub
		dao.save(c);
	}

	@Override
	public void deleteById(int collegeID) {
		// TODO Auto-generated method stub
		dao.deleteById(collegeID);
	}

}
