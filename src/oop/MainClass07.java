package oop;

import java.util.Scanner;

class TestClass07{
	public int[] inputNum() {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("수 입력");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		int[] arr = {num1, num2};
		return arr;
	}
	public int test(int[] n) {

		int sum =0;
		sum = n[0] + n[1];
		return sum;
		}
	public void printNum(int[] n, int sum) {
		System.out.println(n[0] + "+" + n[1] + "=" + sum);
			
	}
	public void printNum2() {
		
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		
		int[] a = t.inputNum(); 
		
		int s = t.test( a ); 
		
		t.printNum(a, s); // a; 입력값, s; 연산값
	
	
	}

}
