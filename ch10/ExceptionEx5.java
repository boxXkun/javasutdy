package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionEx5 {
 public static void main(String[] args) {
	 FileReader fr = myRead("aaa.text");
	
}
 public static FileReader myRead(String name)
	 throws FileNotFoundException{
	 FileReader fr = new FileReader(name);
	return fr;
}
}
