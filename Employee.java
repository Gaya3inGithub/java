package io_packages;

import java.io.Serializable;

public class Employee implements Serializable {
	public  String name;
	public int id,salary;
	public Employee(String name, int id,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}

}
