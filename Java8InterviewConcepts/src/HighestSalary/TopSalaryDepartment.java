package HighestSalary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopSalaryDepartment {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1, "A", "IT", 80000), new Employee(2, "B", "IT", 90000),
				new Employee(3, "C", "IT", 70000), new Employee(4, "D", "IT", 95000), new Employee(5, "E", "HR", 60000),
				new Employee(6, "F", "HR", 65000), new Employee(7, "G", "HR", 55000),
				new Employee(8, "H", "HR", 70000));

		Map<String, List<Employee>> result = employees.stream()
				.collect(Collectors.groupingBy(HighestSalary.Employee::getDepartment,
						Collectors.collectingAndThen(Collectors.toList(),
								list -> list.stream()
										.sorted(Comparator.comparing(HighestSalary.Employee::getSalary).reversed())
										.limit(3).collect(Collectors.toList()))));

		result.forEach((dept, emplist) -> {
			System.out.println("department :" + dept);

			emplist.forEach(System.out::println);
		});

	}

}
