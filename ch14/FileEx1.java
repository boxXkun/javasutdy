package ch14;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		File f = new File("ch14/FileEx1.java");
		//System.out.println(f.exists());
		if(f.exists()) {
		System.out.println("파일이름" +f.getName() );
		System.out.println("파일경로" +f.getPath() );
		System.out.println("파일위치" + f.getAbsolutePath());
		System.out.println("파일이름" + f.canWrite());
		System.out.println("파일이름" + f.canRead());
		System.out.println("파일크기" + f.length() + "byte");
			
		}else {
			System.out.println("파일 없음");
		}
	}

}
