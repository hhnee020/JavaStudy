package java100;
// 자식 부모 클래스; 상속의개념 !
// 자식클래스;

class Hero extends Person1{
	// Person 클래스를 상속 받는다;
	
	String name;
	int age;
	
	//
	Hero(){}
	Hero( String name, int age){ // 호출;
		// 자식 클래스가 호출 되기전에 부모클래스 생성자 초기값 설정 
		super();// 부모 클래스 생성자 호출; 생략해도 알아서 컴파일 한다;
		this.name = name;
		this.age = age;
		
	}// 오버로딩;
	
	
	void walk() {
		System.out.println( " 아직 걷는 중 ; ");
		
	}// 오버라이딩 재정의 ;
	
	void eat() {
		
		System.out.println(" 먹는 중 ; ");
	}
	
	void display() {
		System.out.println(name +" " +age +" "+ gender+" "+power);
		
	}
} 
class Villain{ }
public class superClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1();
		p1.walk();
		//p1.eat();
		/// 자식 클래스 h1
		Hero h1 = new Hero( "블랙위도우" , 22); // 객체 생성, 인자값 2개;
		System.out.println( h1.name);
		System.out.println( h1.age);
		System.out.println( h1.power);// 부모 클래스 변수. 상속 
		System.out.println( h1.gender);// 부모 클래스 변수. 상속 
		h1.walk();
		h1.eat();	
		h1.display();
		
		// 
		
		Hero h2= new Hero("원더우먼", 30);
		h2.display();
		h2.gender=2;
		h2.power=300;
		h2.display();
		h2.walk();
	}
	

}
