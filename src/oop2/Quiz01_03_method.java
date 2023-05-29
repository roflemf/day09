package oop2;

import java.util.Scanner;

public class Quiz01_03_method {
	
	public String inputName(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력 : ");
		String a = sc.next();
		
		return a;
		
		
	}
	public void outputName(String a){
		System.out.println(a);
	}

}
