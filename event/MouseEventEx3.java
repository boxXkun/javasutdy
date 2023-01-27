package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventEx3 extends MFrame {

	Button bt;

	public MouseEventEx3() {
		add(bt = new Button("버튼"), BorderLayout.EAST);
		bt.addMouseListener(new MyMouseAdapter());

}
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mouseEntered(MouseEvent e) {
			setBackground(MColor.rColor());
		}
		public void mouseExited(MouseEvent e) {
			setBackground(MColor.rColor());
		}
	}
	public static void main(String[] args) {
		new MouseEventEx3();
	}
}
