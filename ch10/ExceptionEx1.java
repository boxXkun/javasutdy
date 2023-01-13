package ch10;

public class ExceptionEx1 {
	
	public static void main(String[] args) {
		try {
			
		
		int a = 10;
		int b = 0;
		System.out.println("a + b =" + (a+b));
		System.out.println("a - b =" + (a-b));
		System.out.println("a * b =" + (a*b));
		System.out.println("a / b =" + (a/b));
		} catch (Exception e) {//에외가 일어나면 실행되는 영역
			System.err.println("0은 못나눔");
			//System.err.println(e.getMessage());
		}
		System.out.println("성공");
		
	}
}
