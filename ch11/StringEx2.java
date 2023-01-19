package ch11;

import java.util.Iterator;

public class StringEx2 {

	public static void main(String[] args) {
		String str1 = "Java Programming";

		int len = str1.length();
		System.out.println("len : " + len);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());

		String str2 = str1.substring(5);
		String str3 = str1.substring(5, 10);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		char c1 = str1.charAt(8);
		System.out.println("8번째 : " + c1);
		for (int i = 0; i < str1.length(); i++) {
			if (i % 2 != 0) 
				System.out.print(str1.charAt(i));
			
		}
		int idx1 = str1.indexOf('a');
		System.out.println("\n" + "idx1 : " + idx1);
		int idx2 = str1.lastIndexOf('a');
		System.out.println("idx2 : "+ idx2);
		//변환
		String rpl = str1.replace("a","q");
		System.out.println(rpl);
		
		
		for (int i=0; i <str1.length() ; i++) {
			char rev = str1.charAt(str1.length()-(i+1));
			System.out.print(rev);
		}
		System.out.println();
		String str5 = "Java&JSP&Android&IoT&Spring";
		String str6[] = str5.split("&");
		for (int i = 0; i < str6.length; i++) {
			System.out.println(str6[i]);
			
		}
		String str7 = "             JSPStudy             ";
		System.out.println("^^^"+str7.trim()+"^^^");
		int idx3 = 22;
		String str8 = String.valueOf(idx3);
		String str9 = idx3 + "";
		System.out.println(str8+" : "+str9);
		
		
		
	}

}
