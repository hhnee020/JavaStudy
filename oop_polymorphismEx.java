package java100;


abstract class Car{// 클래스 
	abstract void run(); //메서드  구현 반드시 해놔야한 강제성;
}

class Ambulance extends Car{
	
	void run() {
		System.out.println(" run ");
		
	}
}

class cultivator extends Car{
	
	void run() {
		System.out.println(" run ");
		
	}
}

class sportsCar extends Car{
	
	void run() {
		System.out.println(" run ");
		
	}
	
}
public class oop_polymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Ambulance();
		
		Car c2 = new cultivator();
		
		Car c3 = new sportsCar ();
		
		c1.run();
		c2.run();
		c3.run();
		
		// 배열길이가 3인car 객체 배열 선언;
	
		Car[] cars = new Car[3];
		// 배열 공간 3개 
		
		//배열 초기화;
		System.out.println( cars[0] ); // null
		cars = new Car[] { new  Ambulance() , new cultivator(), new sportsCar () };
	
		System.out.println(cars[0]); // Car c1 = new Ambulance();
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		
		//부모타입으로 자식클래스로 객체생성  ,바로 초기화 : 다형성
		
		Car[] cars2 = { new  Ambulance() , new cultivator(), new sportsCar() };
		
		//반복문으로 run메소드 호출  
		for(int i=0; i<cars.length;i++) {
			System.out.print(cars[i]); // 각객체가 생생된 공간의 주소값 
			cars[i].run();
			
		}
		
		// 항상 된  for 문
		
		System.out.println("----------------");
		
		
		for(Car i: cars) {
			i.run();
		}
		
		//for(Car obj: cars) {
		//		obj.run();
		//}
	
	}

}
