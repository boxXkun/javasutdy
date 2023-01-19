package awt;

import java.awt.Button;

public class NullLayoutEx1 extends MFrame {
	
	Button b1, b2;
	
	public NullLayoutEx1() {
		setLayout(null);
		b1 =new Button("버튼1");
		b2 =new Button("버튼2");
		b1.setBounds(10,50,50,50);
		b2.setBounds(100,50,50,50);
		add(b1);
		add(b2);
	}

	public static void main(String[] args) {
		new NullLayoutEx1();
	}

}
