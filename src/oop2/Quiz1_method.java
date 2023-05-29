package oop2;

import java.util.Scanner;

public class Quiz1_method {
	
	public String inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요.: ");
		String str = sc.next();
		
		return str;
	}
	
	
	
	
	
	public void outputName(String n) {
		System.out.println(n);
		
	}
}
