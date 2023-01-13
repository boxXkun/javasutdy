package ch06;

import common.util.StringUtil;

class Static3
{
	static int a;
	int b;
} 
//static 필드는 동일한 클래스의 모든 객체가 공유될 목적으로 하나만 메모리에 만들어진다.

public class StaticEx3 
{
	public static void main(String[] args) 
	{
		Static3 st1 = new Static3();
		Static3 st2 = new Static3();
		st1.b = 10;
		st2.b = 20;
		System.out.println(st1.b); //10
		System.out.println(st2.b); //20
		
		st1.a = 10;
		st2.a = 20;
		System.out.println(st1.a); //20
		System.out.println(st2.a); //20
		
		String str = "1000000000";
		System.out.println(StringUtil.addComma(str));
	}
}