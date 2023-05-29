package oop;

import java.util.Scanner;

// 하나의 파일에 또다른 Class(잘 안쓰는 방식); 참고만

/*
  method : 어떠한 기능을 가지고 있는 것
  	- 소괄호가 있으면 대부분 어떠한 기능이라고 보면 된다.
  	- method이름을 만드는 방식은 변수이름 만드는 것과 동일하다.
  	  - 해당 기능의 내용과 부합한 이름으로 만든다.
  	  - 합성어면 합성어의 첫 문자는 대문자 sumFunc();
  	  
 */
class TestClass04{
	int age;
	
	public void test() 
		 //void; 반환 타입 test(); 메소드 이름
		{System.out.println("test 호출"); }	

	/*
	 MainClass에서 먼저 되는지 실행해본 후에 TestClass로 옮김 => 후에 Main Class에서 호출해주어야 함
	 */
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수입력 : ");
		num = input.nextInt();
		int sum = 0;
		for(int i = 0; i <=num; i++) {
			sum +=i;
		}
		System.out.println("1~"+num+"까지의 합 : "+sum);
		
	}

}

/* 디버깅 참고
 break point 만들기; 앞에 숫자 더블클릭
 F11; 디버그 시작
 F5; 메소드로 가기
 F6; 한줄씩 내려가며 진행
 Ctrl + F2; 디버그 끝내기
 */


public class MainClass04 {
	
	
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.test();
		System.out.println("main시작");
		t.sumFunc();
		//호출해주기
		System.out.println("종료~~~");
		
		
		
	}

}
