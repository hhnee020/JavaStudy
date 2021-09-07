package java100_oop_ex_2;



// 배열에서 다형성을 사용할수 없다면;
// 배열: 동일한 타입의 데이터를 하나로 묶어서 관리하는 구조  / 다형성이 없다면 
// 객체별로 관리를 해야한다;

	class Person{}
	class Batman extends Person{}
	
	class Human{}
	class Superman extends Human{}
	
	public class Polymorphism_ex7 {
	
		public static void main(String[] args ) {
		
		Person[] persons = new Person[10]; //Person 전용;
		persons[0] = new Person();
		persons[1] = new Person();
		persons[2] = new Batman();
		
		Batman[] batmans= new Batman[10]; // Batman 전용;
		
		batmans[0] = new Batman();
		// batmans[1] = new Person(); 에러 부모를 자식으로 받는것은 불가 하다  
		
		// 배열에서 다형성 사용 장점 ; 
		Human[] humans= new Human[10];
		humans[0] = new Human();
		humans[1] = new  Superman(); // 가능 ;
		
		//매개변수의 다형성
		//System.out.println(); 메서드 어떤 타입,객체  이든 에러 없이 출력  
		// 다형성 을 활용하기때문 이다!
		// 그것이 가능한 이유 --> 바로 다형성을 활용하고 있기 때문이다.
		// 실제 메서드의 API를 보면 --> public void println( Object x ) 로 되어 있기에
		//어떤 객체 타입이 전달되더라도 에러없이 출력이 되는 것이다.
		// 결론적으로, Object는 가장 최상위 타입 (창조주)이므로 어떤 객체를 보내도 그 보다 상위 타입이 된다.
		
		System.out.println();
		System.out.println( new Person() );
		System.out.println(  new Human() );
		
		
		
	}
	
}
