package ch11;

import java.util.Vector;

public class WrapperEx1 {

	public static void main(String[] args) {
		//자바 기본형 8개를 객체화 시킨 것 Wrapper(실제 클래스는 아님)
		int a = 10;
		//Auto Boxing
		Integer it1 = a;//원래 변환 x
		//Auto Unboxing;
		int b = it1;
		Vector v = new Vector();
		v.add(a);
		v.add(it1);
		int c = (Integer) v. get(0); //auto unboxing;;
		
		Integer it2 = new Integer(10);
		Integer it3 = new Integer("20");
		Integer it4 = Integer.valueOf(10);
		Integer it5 = Integer.valueOf("20");
		int a1 = it4.intValue();
		a1 = it4;
		int b1 = it5.intValue();
		int c1 = a1+b1;
		System.out.println(c1);
		int a2 = Integer.parseInt("30");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toBinaryString(a2));
	}
}
