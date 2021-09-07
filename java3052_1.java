package backjun1;

import java.util.HashSet;
import java.util.Scanner;

public class java3052_1 {
	/*
	 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
	 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

		수 10개를 입력받은 뒤,
		이를 42로 나눈 나머지를 구한다.
		그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		// 만약 중복되는 값이 없으면 HashSet 에 저장되면서 True 를 반환
		//만약 중복되어 저장되지 않으면 False 를 반환한다.
		
		for( int i=0; i<10; i++) { //10회 실행;
			
			hs.add(scn.nextInt() % 42); // 추가 하고 42로 나눔 ;
		//HashSet.add() 메소드는 HashSet에 저장하는 메소드
		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
			
		}
			scn.close();
			System.out.print(hs.size());
			//중복 제거 후( 중복 된 값은 저장하지 않음 ) 몇개 있는지를 반환 ;
			//저장되어 있는 원소의 개수
	}
}
