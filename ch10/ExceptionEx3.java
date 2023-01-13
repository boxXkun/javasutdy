package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args){
		Scanner s =null;
		try {
			double a,b;
			s = new Scanner(System.in);
			System.out.println("첫번째 숫자 :");
			a = s.nextInt();
			System.out.println("두번째 숫자 :");
			b = s.nextInt();
			System.out.println(a +"/" +b +" = " +(a/b));
			//다중 catch (Exception e)이 위에 옴.
			} catch (ArithmeticException e) {
			System.out.println("0은 빠져있어");
			} catch (InputMismatchException e) {
				System.out.println("0은 빠져있어");
			}finally {
			s.close();//사용 후에 반드시 닫아야 한다.
			}
		}
	}
	

//ArithmeticException 0으로 나눔
//InputMismatchException 문자 입력
