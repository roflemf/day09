package oop;

public class MainClass03 {
	/*
	 - 접근 제한자
	 	private
	 	- 클래스 내부에서만 접근
	 	public
	 	- 클래스 외, 내부에서 모두 접근 가능
	 	protected
	 	- 일반적인 경우에는 private와 동일하게 클래스 내부에서 접근
	 	  상속시에는 상속받은 자식에서도 접근 가능
	 	- private 와 public 의 중간정도의 범위를 가지고 있다.
	 	default(키워드가 없는 경우)
	 	- 동일한 패키지 내에서 접근 가능
	 	
	 */

	public static void main(String[] args) {
		TestClass03 t =
				new TestClass03();
		t.age = 20;
	}
	
	
}
