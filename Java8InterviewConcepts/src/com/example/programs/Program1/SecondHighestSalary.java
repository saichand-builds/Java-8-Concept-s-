package com.example.programs.Program1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "Sai", 6732.2), new Employee(2, "Harshi", 827382.2),
				new Employee(3, "Shafi", 63718.1), new Employee(4, "kavi", 5523.3));

		Optional<Double> secondsalary = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder())
				.skip(1).findFirst();

		if (secondsalary.isPresent()) {
			System.out.println("second salary is " + secondsalary.get());

		} else {
			System.out.println("not found");
		}

	}

}
