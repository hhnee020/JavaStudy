

abstract class Animal{
	// 추상 클래스; 부모클래스와 같은 역할을 한다
	
	abstract void cry();
	void eat(){
	System.out.println("먹다");
	}// 일반 메서드 가능 ;

//System.out.println("울다");
//구체적으로 내용을 작성하지 않고 선언만! (리턴값도 없이 메서드 명만); 
// 상속받은 자식 클래스는 부모클래스의  메서드를 무조건 가져야한다 (강제성) ;

}

class Dog extends Animal{ 
	@Override
			void cry(){ 
				System.out.println("멍멍");}
}// 재정의 후 사용 가능 
	
	class Cat extends Animal{
		@Override
		void cry(){System.out.println("야옹");}

}
	class Cow extends Animal{
	@Override
		void cry(){
			System.out.print("음메 ");}
}
	class Animal2{
	
	void fly() {
		System.out.println("날다");
		
	}
}

public class AbsClassMethod{

	public static void main(String[] args) {
		//Animal a1 = new Animal(); Err
		Animal2 a2 = new Animal2();
		
		Dog dog = new Dog();
		Cow cow = new Cow();
		a2.fly();
		dog.cry();
		cow.cry();
		
		//Summary
		// 추상 클래스는 다른(자식)클래스들의 공통적인 특징을 변수나 메서드만 정의한것 ;
		// 필드 생성자 메서드 포함 할수 있다!
		// 메서드 선언만 있고 내용은 없으므로 객체 생성 불가;
		// 부모 클래스 역할은 하지만 상속받은 자식클래스에서 재정의해서 사용해야한다; - 역할만 가능 추상클래스에서 선언만 해놓기 때문에 자식 클래서 상속받아 구현해야함;
		// 강제성을 부여하기 위함 부모 클래스가 선언해놓은 메서드 를 자식클래스가 그대로 재정의 해 구현! 
		//추상클래스를 상속을 받 으면 재정의 해서 사용해야한다
		// 추상메서드들 포함하고 있다면 추상클래스여야한다;
		// 재정의를 하고 싶지 않다면? --  자식 클래스에 상속받은 메서드를 구현하지 않을려면 자식클래스도 lass 에 abstract을 붙힌다 
	}
}
