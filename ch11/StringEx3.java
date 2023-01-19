package ch11;

import java.util.Iterator;

public class StringEx3 {

	public static void main(String[] args) {
		String str = "전지현이 백화점에서 팬사인회를 연다."
				 + "전지현은 5일 오후 3시 서울 소공동 롯데 백화점"
				 + " 8층 이벤트홀에서... 구두 브랜드 조이제화의" 
				 + " 홍보를 위한 팬사인회에 참석한다.";	
//1번 순방향 공백 문자의 index 번호 출력
		int len =str.length();
		int idx = -1;
		do {
			idx =str.indexOf(' ', idx+1);
			if(idx>=0) System.out.print(idx +", ");
		} while(idx>0);
		
		for (int i = 0; i < len; i++) {
			if(str.charAt(i)==' ')
				System.out.print(i+",");
		}
		System.out.println();
	// 2 역방향 공백문자의 index 번호출력
		
		
		for (int i = len-1; i > 0; i--) {
			if(str.charAt(i)==' ')
				System.out.print(i+",");
		}
		System.out.println();
	//3번 빈칸 _ 출력
	System.out.println(str.replace(' ', '_'));
	// 4. 첫단어 출력
	int a = str.indexOf(' ');
	String str2 = str.substring(0,a);
	System.out.println("str2 : "+ str2);
	//5. 마지막 단어 출력
	int b = str.lastIndexOf(' ');
	String str3 = str.substring(b,len);
	System.out.println("str3 : "+ str3);
}}
