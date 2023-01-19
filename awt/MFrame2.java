package awt;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MFrame2 extends Frame{

	public MFrame2() {
		this(300,300,new Color(220,220,220),false);
	}

	public MFrame2(int w, int h) {
		this(w,h,new Color(220,220,220),false);
	}

	public MFrame2(Color c) {
		this(300,300,c,false);
	}

	public MFrame2(int w, int h,Color c ) {
		this(w,h,c,false);
	}

	public MFrame2(int w, int h, Color c, boolean flag) {
		setSize(w, h);
		setLayout(new BorderLayout());
		setBackground(c);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		setResizable(flag);
	}

	public void actionPerformed(ActionEvent e) {
	}

}
