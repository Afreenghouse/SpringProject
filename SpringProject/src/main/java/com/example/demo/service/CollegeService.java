package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.College;

public interface CollegeService {
	public List<College>findAll();
	public College findById(int studentID);
	
	public void saveorUpdate(College c);
	public void deleteById(int collegeID);
}
