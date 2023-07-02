package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Emplooyee_Info")

public class Employee {
       
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int id;
	   @Column(name="Emp_Name")
	   private String name;
	   @Column(name="Emp_Designation")
	   private String design;
	   @Column(name="Emp_Salary")
	   private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	   
	   
	   
	   


}
