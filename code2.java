package CodeupTest;

import java.util.Arrays;
import java.util.Scanner;

public class code2 {
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" 갯수  : ");
		int n = scn.nextInt();
		
		int[] arr = new int[n];  
		
		for(int i= 0; i< n ; i++) {
		
			arr[i] =scn.nextInt();
		
		}
			
		
		scn.close();
		Arrays.sort(arr); // 최대값 구하는 메소드; 오름차순으로 정렬
		System.out.print(arr[0] + " " + arr[n - 1]);
		
	}

}

	



