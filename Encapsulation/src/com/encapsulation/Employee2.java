package com.encapsulation;

public class Employee2 {
	private String name;
	private int id;
	static String companyName = "TNS";
    public Employee2() {	
	}
	Employee2(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}

}
