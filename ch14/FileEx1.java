package ch14;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		File f = new File("ch14/FileEx1.java");
		//System.out.println(f.exists());
		if(f.exists()) {
		System.out.println("�����̸�" +f.getName() );
		System.out.println("���ϰ��" +f.getPath() );
		System.out.println("������ġ" + f.getAbsolutePath());
		System.out.println("�����̸�" + f.canWrite());
		System.out.println("�����̸�" + f.canRead());
		System.out.println("����ũ��" + f.length() + "byte");
			
		}else {
			System.out.println("���� ����");
		}
	}

}
