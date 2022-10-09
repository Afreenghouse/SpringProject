package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="collegemanagement")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="collegeID")
	private int collegeID;
	@Column(name="collegename")
	private String collegename;
	@Column(name="studentname")
	private String studentname;
	@Column(name="studentID")
	private int studentID;
	@Column(name="departent")
	private String department;
	@Column(name="year")
	private int year;
	@Column(name="grade")
	private String grade;
	@Column(name="percentage")
	private float percentage;
	@Column(name="batch")
	private int batch;
	@Column(name="email")
	private String email;
	@Column(name="phonenumber")
	private long phonenumber;
	
	public College() {
		
	}
	
	public College(int collegeID,String collegename,String studentname,int studentID,String department,int year,String grade,float percentage,int batch,String email,long phonenumber) {
		super();
		this.collegename=collegename;
		this.collegeID=collegeID;
		this.studentname=studentname;
		this.studentID=studentID;
		this.department=department;
		this.grade=grade;
		this.percentage=percentage;
		this.email=email;
		this.phonenumber=phonenumber;
		this.year=year;
		this.batch=batch;
	}

	public int getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "College [collegeID=" + collegeID + ", collegename=" + collegename + ", studentname=" + studentname
				+ ", studentID=" + studentID + ", department=" + department + ", year=" + year + ", grade=" + grade
				+ ", percentage=" + percentage + ", batch=" + batch + ", email=" + email + ", phonenumber="
				+ phonenumber + "]";
	}
	
	
	
}
