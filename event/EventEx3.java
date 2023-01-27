package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import awt.MColor;
import awt.MFrame;

class MyAction1 implements ActionListener {

	EventEx3 f;

	public MyAction1(EventEx3 f) {
		this.f = f;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f.setBackground(MColor.rColor());
		f.btn.setBackground(MColor.rColor());
	}
}

public class EventEx3 extends MFrame {

	Button btn;

	public EventEx3() {
		add(btn = new Button("버튼"),
			BorderLayout.SOUTH);
		MyAction1 ma = new MyAction1(this);
		btn.addActionListener(ma);
		validate();
	}
	

	public static void main(String[] args) {
		new EventEx3();
	}

}
