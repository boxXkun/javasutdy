package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import awt.MColor;
import awt.MFrame;

/*2.버튼을 클릭하면 actionEvent객체르 발생
 * 이벤트 소스랑 actionEvent 객체를 연결하기 위한
 * actionListener를 구현*/

public class EventEx1 extends MFrame
implements ActionListener{
	
	Button btn;
	
	public EventEx1() {
		add(btn = new Button("버튼"),
			BorderLayout.SOUTH);
		btn.addActionListener(this);
		validate();
	}
	
	//3.이벤트 리스너의 메소드 (이벤트 핸들러) 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
		
	}
	
	public static void main(String[] args) {
		new EventEx1();
		
	}
}
