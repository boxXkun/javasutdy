package ch11;


class Point1{}
public class ObjectEx1 {

	public static void main(String[] args) {
		Point1 p = new Point1();
		System.out.println("클래스 이름 : "+p.getClass());
		System.out.println("해쉬코드 : "+p.hashCode());
		System.out.println("객체 문자열 : "+ p.toString());
		
		Point1 p1 = new Point1();
		System.out.println("클래스 이름 : "+p1.getClass());
		System.out.println("해쉬코드 : "+p1.hashCode());
		System.out.println("객체 문자열 : "+ p1.toString());
		String s = new String("금요일");
		System.out.println("객체문자열 : "+ s.toString());

	}

}
