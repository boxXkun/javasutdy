package awt;

import java.awt.Frame;
import java.awt.Label;

public class LabelEx1 extends MFrame {

	Label label[] =  new Label[4];
	int pos[] = {Label.LEFT, Label.CENTER, Label.RIGHT, Label.LEFT};

	public LabelEx1() {
		super(200, 200);
		setTitle("Label Example");
		String str = "오늘은 기분 좋은 수요일";
	for (int i = 0; i < label.length; i++) {
		label[i] = new Label(str, pos[i]) ;
		label[i].setBackground(MColor.rColor());
		add(label[i]);
	}	
	validate();
} 

	public static void main(String[] args) {
		new LabelEx1();
	}

}
