package oop2;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2_method {
	public String[] inputName() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력");
		String n = input.next();
		
		System.out.print("이름 입력");
		String o = input.next();
		
		System.out.print("이름 입력");
		String p = input.next();
		
		String[] array = {n, o, p};
		//System.out.println(Arrays.toString(array));
		return array;
	}
	
	public void outputName(String[] name) {
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
	}
}
