package ch11;


public class PalindromeEx1 {

	static final int MAX = 100000; 
	
	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다.
		 *   대칭수(palindrome)인 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
        */
		
		//문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int ans1 = 0;
		
		for(int i=0;i<100001;i++) {
			String pb1_1 =Integer.toString(i);
			String pb1_2 =new StringBuffer(pb1_1).reverse().toString();
	
			if(pb1_1.equals(pb1_2)){
				ans1 = ans1 + i;
			}
			
			}
		System.out.println(ans1);
			
			
				
			
		
		
		//문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int ans2 = 0;
		
		for(int i=0;i<100001;i++) {
			String pb2_1 =Integer.toBinaryString(i);
			String pb2_2 =new StringBuffer(pb2_1).reverse().toString();
			
			if(pb2_1.equals(pb2_2)){
				ans2 = ans2 + i;
			}
			
			}
		System.out.println(ans2);
			
		//문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		int ans3 = 0;
		
		for(int i=0;i<100001;i++) {
			String pb3_1 =Integer.toString(i);
			String pb3_2 =new StringBuffer(pb3_1).reverse().toString();
			String pb3_3 =Integer.toBinaryString(i);
			String pb3_4 =new StringBuffer(pb3_3).reverse().toString();
				 
				if(pb3_1.equals(pb3_2)&&pb3_3.equals(pb3_4)) {
					ans3= ans3+i;
				}
			
		}
		System.out.println(ans3);	
	}
}



