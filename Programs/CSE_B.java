package com.ts.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CSE_B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students to enter:");
		int numberOfStudents=sc.nextInt();
		if(numberOfStudents<=0)
		{
			System.out.println("Not Valid");
			return;
		}
		Map<Integer, String> studentsDetails=new HashMap<>();
		for(int i=1;i<=numberOfStudents;i++)
		{
			System.out.println("Enter the Roll no of Student "+i+" :");
			int rollNo=sc.nextInt();
			System.out.println("Enter the Name no of Student "+i+" :");
			String name=sc.next();
			studentsDetails.put(rollNo, name);
		}
		
		System.out.println("RollNo        Name");
		for(Map.Entry<Integer, String> student:studentsDetails.entrySet())
		{
			System.out.println(student.getKey()+"     "+student.getValue());
		}
	}

}
