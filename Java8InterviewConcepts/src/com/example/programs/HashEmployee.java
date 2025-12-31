package com.example.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

 class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}

public  class HashEmployee {
	 
	public static void main(String[] args) {
		
		Map<Employee, String> map= new HashMap<Employee, String>();
		
		Employee e1= new Employee(12, "Sai");
	//	Employee  e2 = new Employee(12, "Sai");
		Employee  e2 = new Employee(12, "Harshi");    // Null
		
		//Even though e1 and e2 are different objects, HashMap treats them as the same key because their data is equal, so it returns the value stored earlier.
		
		map.put(e1, "Developer");
		
		System.out.println(map.get(e2));
		
	}
}
