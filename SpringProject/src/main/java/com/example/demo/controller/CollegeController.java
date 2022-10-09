package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.College;
import com.example.demo.service.CollegeService;

@RestController
@RequestMapping("/College")
public class CollegeController {
	@Autowired
	CollegeService service;
	@GetMapping("/list")
	public List<College>findAll()
	{
		return service.findAll();
		
	}
	@GetMapping("/findbystudentID")
	public College findById(int studentID) {
		return null;
}
	@PostMapping("/save")
	public void save(@RequestBody College c) {
		c.setStudentID(0);
		service.saveorUpdate(c);
	}
	@PutMapping("/update")
	public void Update(@RequestBody College c) {
		service.saveorUpdate(c);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int collegeID)
	{
		College e=findById(collegeID);
		if(e==null)
		{
			throw new RuntimeException("delete id not found");
		}
		else
		{
			service.deleteById(collegeID);
		}
		return "Product"+collegeID;
	}

}
