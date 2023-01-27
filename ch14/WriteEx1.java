package ch14;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteEx1 {

	public static void main(String[] args) {
		int i = 'A';
		char c = 'b';
		char c1 = '°ø';
		try {
			OutputStream os = System.out;
			Writer writer = new OutputStreamWriter(os);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}

		