package ch14;

import java.io.OutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		int i = 'A';
		char c = 'b';
		char c1 = '°ø';
		try {
			OutputStream os = System.out;
			os.write(i);
			os.write(c);
			os.write(c1);
			os.flush();
			os.close();
		} catch (Exception e) {}
		
	}

}
