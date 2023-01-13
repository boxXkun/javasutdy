package ch10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int arr[]= new int[3];
			arr[0] = 10;
			arr[1] = 10;
			arr[2] = 10;
			arr[3]= 10;
			System.out.println("가능?");
		} catch (Exception e) {
			System.out.println("불가능");
		}
		System.out.println("쌉가능");
	}

}
