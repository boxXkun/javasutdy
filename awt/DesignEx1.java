package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

public class DesignEx1 extends MFrame {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx1() {
		super(250,150);
		setTitle("������ ����1");
		Panel p1,p2;
		cbg = new CheckboxGroup();
		label = new Label("�����߿� ���� ",label.CENTER);	
		label.setBackground(Color.green);
		p1 =new Panel();
		add(label, BorderLayout.NORTH);
		p1.add(cb1 = new Checkbox("���", cbg, true));
		p1.add(cb2 = new Checkbox("����", cbg, true));
		p1.add(cb3 = new Checkbox("�޵�", cbg, true));
		p2 =new Panel();
		p2.add(btn1 = new Button("start"));
		p2.add(btn2 = new Button("end"));
		add(p1);
		add(p2, BorderLayout.SOUTH);
		
		
	}	
	

	public static void main(String[] args) {
		new DesignEx1();
	}

}

