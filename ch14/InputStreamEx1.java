package ch14;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		InputStream is = System.in;
		while (true) {
			try {
				int a = is.read();
				if (a == -1)break;
					System.out.println((char) a);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
