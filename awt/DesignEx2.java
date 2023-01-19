package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesignEx2 extends MFrame2
implements ActionListener{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2;
	
	public DesignEx2() {
		super(500,400);
		setTitle("디자인 예제2");
		setLayout(new BorderLayout());
		add(ta = new TextArea(), "Center");
		
		
		ta.setEditable(false);
		// 그룹 컨테이너
		p1 = new Panel();
		p2 = new Panel();
		p1.add(tf= new TextField(30));
		p2.add(btn1 = new Button("마우스 테스트"));
		p2.add(btn2 = new Button("종료"));
	
		tf.addActionListener(this);
		btn1.addActionListener(this);
		add(p1,"North");
		add(p2,"South");
		validate();
		tf.requestFocus();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText().trim();
		if(str.length()==0)
			str ="입력을 하세요";
		ta.append(str+"\n");
		tf.setText("");
		tf.requestFocus();
	}
	
	
	
	public static void main(String[] args) {
		new DesignEx2();
	}
}

