package oop;

import java.util.ArrayList;

public class TestClass06 {
	public void test1(int n, String s, double d) {
		System.out.println("n: " +n);
		System.out.println("s: " +s);
		System.out.println("d: " +d);
		
	}

	public void test2(ArrayList<String> a) {
		System.out.println( a );
	}
	
	
		  //void: return 으로 돌려줄 값이 없다
	public void test3() {
		int num =1;
		if( num ==1 ) {
			System.out.println("1111");
			return; //뒤에 값은 사용 불가
		}else if(num==2) {
			System.out.println("2222");
		}
		System.out.println("다음 문장 실행");
		
		
	}
	
	public int test4() {
		/*
		int num=0, su =1;//num 초기화 시켜주기 
		if(su ==1) {
			num =100;
		}
		System.out.println( num );
		*/
		int num=0;
		if(num ==0) {
			return 100;  // return 뒤에 여러값 불가; 한번에 한 값씩
		}else {
			return 0;
		}
//		System.out.println("다음문장");
//		return 100;
	}
	public int[] test5() {
		int[] num = {100,200,300};
		return num;
		
	}
}
