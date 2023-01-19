package ch10;

public class ExceptionEx7 {
	int a = 100;
	public void m(int b) throws Exception{
		if(b==0)
			throw new Exception("0으로 누가 나누냐");
		else
			System.out.println(a+" / "+b+" = "+(a/b));
		
	}
	public static void main(String[] args) {
		ExceptionEx7 et = new ExceptionEx7();
		try {
			et.m(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}