package com.example.programs.Program1;


public class Employee {
	
	private int id;
	private String Name;
	private Double Salary;
	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		Name = name;
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	
	
}
