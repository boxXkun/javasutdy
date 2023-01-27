package ch12;

public class ThreadEx1 extends Thread{

	String name;

	public ThreadEx1(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200);
				System.out.println(name + " : " + i);
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		ThreadEx1 n1 = new ThreadEx1("1");
		ThreadEx1 n2 = new ThreadEx1("2");
		n1.start();
		n2.start();
	}

}
