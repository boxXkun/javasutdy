package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEx1 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);	
		//70년 1월 1일
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String str = sdf.format(d);
		System.out.println(str);
	}
}
