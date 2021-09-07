package backjun1;


import java.util.Scanner;
 
public class java2577_1 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int value = (in.nextInt() * in.nextInt() * in.nextInt());
		// 수를 3개 받고 곱함 ;
		String str = Integer.toString(value);
		// int 형을 String 으로 바꿔 줌 
		in.close();
		
		for (int i = 0; i < 10; i++) { // a*b*c 9회반복 
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				// str 길이만큼 ;
				if ((str.charAt(j) - '0') == i) {
					count++;
				//charAt() 을 통해 해당 인덱스의 문자와 i 가 같은 수가 몇개 있는지
				// 9회 반복하며 나온 숫자가 j 와 같은지 그리고 cnt로 증가 
				// 반드시 charAt() 을 쓸 경우  - '0' 또는 -48 을 연산해야 한다.
					//(아니면 아스키코드에 대응하는 문자가 나온다.)
				}
			}
			System.out.println(count);
		}
		
	}
}
