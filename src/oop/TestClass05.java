package oop;

import java.util.Scanner;

public class TestClass05 {
	
						//매개변수 또는 argument(받는 값) ; 전달값과 받는값의 자료형 일치시켜야 오류 X
	public void sumFunc(int num) { // int num = 100;
		
		int sum = 0;
		for(int i = 0; i <=num; i++) {
			sum +=i;
		}
		System.out.println("1~"+num+"까지의 합 : "+sum);
		
	}
		//void(반환값)과 return 자료형 일치시켜주기
	public int sumFunc2(int num) { // int num = 100;
		
		int sum = 0;
		for(int i = 0; i <=num; i++) {
			sum +=i;
		}
		//메소드를 종료하는 기능
		// return 다음에 값이 있으면, 값을 돌려주는 기능
		return sum;
	}

}
