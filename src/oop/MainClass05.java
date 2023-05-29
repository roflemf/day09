package oop;

import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	
	int n;// 첫글자 소문자; 변수
	
	TestClass05 t= new TestClass05();  // 첫글자 대문자; 객체 ; 참조형(대상: 객체) 변수 ;  
	
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("수입력 : ");
	num = input.nextInt();
	
	//100; 인자값 또는 parameta(전달 값)
	t.sumFunc( num );
	System.out.println("sumfunc222");
	
	
	int s = t.sumFunc2(num);
	System.out.println("1~"+num+
			"까지의 합 : "+s);
	
	
}
}
