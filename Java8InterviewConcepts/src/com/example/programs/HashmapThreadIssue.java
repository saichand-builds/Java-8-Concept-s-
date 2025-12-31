package com.example.programs;

import java.util.HashMap;
import java.util.Map;

public class HashmapThreadIssue {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		// Thread 1

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				map.put(i, "Value is " + i);
				System.out.println("value is " + i);

			}
		});

		// Thred 2

		Thread t2 = new Thread(() -> {
			for (int i = 1001; i <= 2000; i++) {
				map.put(i, "value is " + i);
				System.out.println("value is " + i);

			}
		});

		t1.start();
		t2.start();

	}

}
