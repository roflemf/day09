package oop2;

import java.util.Scanner;

public class Quiz02_01_method {

	public String[] inputName(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String a = sc.next();
		System.out.print("이름 입력 : ");
		String b = sc.next();
		System.out.print("이름 입력 : ");
		String c = sc.next();
		String[] array = {a,b,c};
		return array;

	}
	
	public  void outputName(String[] A) {
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
	}
	
}
