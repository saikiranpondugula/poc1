package com.saikiran.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "studentDetails")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int studentId;
private String name;
private String className;
private String emailId;
private long phoneNo;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + ", className=" + className + ", emailId=" + emailId
			+ ", phoneNo=" + phoneNo + "]";
}
}
