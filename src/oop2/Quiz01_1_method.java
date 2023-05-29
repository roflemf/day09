package oop2;

import java.util.Scanner;

public class Quiz01_1_method {
	
	
	public String printName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력: ");
		String n=sc.next();
		
		return n;
	}

	public void printoutName(String name) {
		System.out.println(name);
	}
}
