package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.College;

@RepositoryRestResource(path="jpa")
public interface CollegeRepository extends JpaRepository<College,Integer>{

}
