
// Interface ! 결합부 접속기  사용자 또는 컴퓨터간의 통신이 가능하도록 해주는 디바이스 프로그램;
// 상호간 통신을 위해서는 규격이 중요하다!  규격을 인터페이스는 하나의 표준화라고 할수있다;

// 추상 클래스와 인터페이스는 거의 비슷 하지만 인터페이스는 추상화정도가 더 높다;
// 따라서 일반 메서드 멤버 필드  가질 수 없다 (추상 클래스는 가능)
// 표준화 및 규격을 인터페이스로 제공하는 것
// 따라서 어떤 클래스가 해당 인터페이스를 사용(상속)할려면 선언되어져 있는 메소드를 구현해야한다
//class > extends Interface > implement
// 추상 클래스처럼 상속받아 재정의해 써야한다;
//상속 구현 클래스와 인터페이스 차이점 ; !상속
//extend 확장하다: 상속받은것을 확장 시킨다  (X) implement(O) 구현: 상속받은 것을 표현하다 
// 인터페이스는 다중 상속이 가능하다 상속이라는 표현을 쓰지 않고   자바에서 클래스는 단일 상속만 가능

// 1. 인터페이스: 추상 클래스와 비슷 추상화 정도가 높음 ; 엄격 ( 일반 멤버필드 메서드 불가)
//표준화 및 규격을 제공 - 설계도 개념 ;
// 따라서 어떤 클래스 해당 인터페이스를 사용하고자 한다면 선언되어져 있는 메서드 구헌
// 2 상속
// 클래스는 단일 상속, 인터페이스는 다중 상속
// 3.장점
// 추상적인 선언과 메서드들을 구체적인 구현을 분리시킬 수있다; 
// ex) 하청 주는 대기업은  인터페이스만 제공 각 하청업체들이 준수하여 상속 받아 개발한다;
// 분업화 시스템 독립적으로 프로젝트 개발 가능 
//4. 우선순위 extend가 먼저 
// 상속을 받는 extend 와 구현을 하는 implement 둘중 동시에 쓰일때  extend 가 항상 먼저;
class Person {
String name;
int age;
int weight;

	Person (){}
	Person (String name, int age , int weight){
	    this.name = name;
	    this.age = age;
	    this.weight= weight;
}

void wash(){
    System.out.print("씻다");
}
void Study(){
    System.out.print("공부");
}
void play(){
    System.out.print("놀다");
}

}
interface Allowamce{
	//변수는 안되나 상수는 지정 된다 ; public static final
	//인터페이스 내 멤버 필드는  public static final  이어야 한다; 항상 그러므로 생략가능( 컴파일 과정에서 붙여짐 );
	//public abstract  이어여한다;
	public static final String aaa="korea";
	public static final int bbb=1000;
	// 상수는 가능하다;


	///인터페이스 내 모든 메서드는 public abstract  이어여한다 생략가능;
	abstract void in(int price, String name); // 추상메서드만 ;
	abstract void out(int price, String name);
}


interface Train{
	
	abstract void train( int training_pay, String name);
}
	
	

class Student extends Person implements Allowamce, Train{
    // 인터페이스는 implementsㅇ로 상속을 받는다 , 여러개를 한번에;  자식 클래스에서는 무조건 사용 
	
	// 필드;
	Student(){}
	Student(String name, int age, int weight ){
		super(name, age, weight);
		
		
	}
	//Allowamce method
    @Override
    public void in( int price ,String name) { 
    							
    								System.out.printf("%n %s에게서 %d원 용돈을 받았다. %n" , name, price);}
    @Override
    public void out( int price ,String name) {
    	
    								System.out.printf("%d원 금액을 지출했습니다. [지출용도 > %s]. %n" , price ,name );}
   
    //Train method 
    @Override
    public void train( int training_pay, String name ) {
    								System.out.printf( "%s > %d원 입금 완료. %n",name,training_pay );
    }

}




public class oop_Interface {

public static void main(String[] args) {
    

	Student s1= new Student( "홍길동", 22,55 );
	
	//클래스와 인터페이스 상속(Person) 구현(Allowamce , Train)한  메서드 호출하
	System.out.println( s1.name ); // 홍길동 ;
	
	s1.wash();
	s1.Study();
	s1.play();
	//Preson 상속 ;

	
	s1.in(10000, "엄마" );
	s1.out(5000, "편의점" );
	//Allowamce
	s1.train(50000, "아빠");
	//Train

	//!! 상수필드 사용하기;
	///1)
	System.out.println(s1.aaa);
	System.out.println(s1.bbb);
	// System.out.println(aaa); -- Err (x)

	//2)Static :인스턴트 생성 없이 바로 접근 해서 사용가능
	//  객체를 사용하지 않더라도 인터페이스명으로 접근 ;
	System.out.println( Allowamce.aaa );
	System.out.println( Allowamce.bbb );
}

}
