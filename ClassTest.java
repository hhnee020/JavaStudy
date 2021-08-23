package java100;



class FarmMachine {
// 1.속성 
	int price;
	int year;
	String color;
	
	
	//2. 동작 (메서드 )
	
	void move() {
		
		System.out.println(" FarmMachine is Moving ");
	}
	
	
	void dig() {//메소드가 행동이 리턴 값이 없을 경우 void 를 쓰고 인자는 쓰지않는다;
		
		System.out.println(" FarmMachine is digging ");
	}
	


	void grind() {
		
		System.out.println(" FarmMachine is grinding ");
	}

}
	


public class ClassTest {
		
	//클래스 란 객체 , 인스턴스를 생성하는 공장(틀);
	// 객체의 특징 -- 속성
	// 객체의 동작  --  메서드 / 함수와 거의 동일 ;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성 ;
		FarmMachine fm = new FarmMachine();
		//System.out.println(fm);
		
		//
		
		
		fm.color = "red";
		fm.price = 100000;
		fm.year = 2021;
		String fm_price= String.format("%,d", fm.price );
		System.out.println( fm_price );
		System.out.println( fm.year );
		System.out.println( fm.color );
		//
	
		fm.dig();
		fm.move();
	}

}
