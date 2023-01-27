package ch12;

public class ThreadEx2 {
	String name;

	public ThreadEx2(String name){
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200);
				System.out.println(name + " : " + i);
			} catch (Exception e) {}
		}
	}

	public void start() {
		run();
	}

	public static void main(String[] args) {
		ThreadEx2 n1 = new ThreadEx2("1");
		ThreadEx2 n2 = new ThreadEx2("2");
		n1.start();
		n2.start();
	}

}
