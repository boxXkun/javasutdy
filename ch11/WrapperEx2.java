package ch11;

public class WrapperEx2 {
	public static void main(String[] args) {
		char c1 = 'J';
		System.out.print(c1);
		if (Character.isLetter(c1))
			System.out.println(" : 문자");
		
		char c2 = 'a';// 대문자인지 소문자인지
		System.out.print(c2);
		if (Character.isLowerCase(c2))
			System.out.println(" : 소문자");

		char c3 = '2';// 숫자인가
		System.out.print(c3);
		if (Character.isDigit(c3))
			System.out.println(" : 숫자");
		
		char c4 = ' ';//공백인가
		System.out.print(c4);
		if (Character.isWhitespace(c4))
			System.out.println(" : 빈칸");
		
		Long l;
		Boolean b;
		Short s;
		Double d;
		Float f;
		Byte bt;
		Integer i;
		Character c;
	}
}
