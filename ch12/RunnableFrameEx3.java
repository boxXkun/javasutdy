package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RunnableFrameEx3 extends MFrame implements Runnable {

	Random r = new Random();
	int x, y;
	Color c;

	public RunnableFrameEx3(int x, int y,Color c) {
		super(200, 200);
		setLocation(x, y);
		this.c = c;
	}

	public RunnableFrameEx3() {
	}

	public void run() {
		for (int i = 0; i < 30; i++) {
			x = r.nextInt(200);
			y = r.nextInt(200);
			try {
				Thread.sleep(50);
				repaint();
			} catch (Exception e) {
			}
		}
	}

	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, 10, 10);
	}

	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}

	public static void main(String[] args) {
		int i = 0;	
		while (i < 9) {
			int x = 200 * (Math.floorMod(i, 3));
			int y = 200 * (Math.floorDiv(i, 3));
			RunnableFrameEx3 r1 = new RunnableFrameEx3(x,y,MColor.rColor());
			Thread t1 = new Thread(r1);
			t1.start();
			i++;
		}
	}

}
