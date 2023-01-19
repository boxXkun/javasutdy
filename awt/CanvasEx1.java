package awt;

import java.awt.Canvas;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CanvasEx1 extends MFrame  {
	
	Canvas c;
	
	public CanvasEx1() {
		c= new Canvas();
		c.setSize(100,100);
		c.setBackground(MColor.rColor());
		add(c);
		
	}
	public static void main(String[] args) {
		new CanvasEx1();
	}

}
