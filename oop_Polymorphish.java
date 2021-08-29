package java100;
// 다형성;
// 부모 클래스를 상속받은 자식 클래스의 인스턴트가 부모의 객체로도 사용 되고 자식 클래스의 객체로도 사용되는 다양한 상황;  
// 하위 클래스 인스턴트 는 상위클래스 객체로도 사용될 수있다;

//ex) 앵무새가 말을하네 , 새가 말을하네;
//Parrot p1 = new Parrot();
// Bird p1 =  new Parrot();; 하지만 반대는 안된다; 분명 상위 앵무새 >= 새 ; 모든 새가 앵무새는 아니다; 
//Parrot() p1= new Bird p1 ; -- Err
// 상위 클래스의 객체는 하위클래스의 객체( 인스턴트 )로 사용 될수 없다;
class Bird{
	String str1 ="상위 클래스 ";
	void method1() {System.out.println("abc");}
	void a() {System.out.println(" aaa");}
}



class Parrot extends Bird{
	String str2 ="하위 클래스 ";
	void method1() {System.out.println("1234");} // 재정의(오버라이딩;)
	void b() {System.out.print("bbb");};
}

	public class oop_Polymorphish {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//1.자식-자식: 부모,자식 클래스의 자원을 다 쓸 수 있다
			Parrot  p1 = new Parrot();
			System.out.println(p1.str1);
			System.out.println(p1.str2);
			p1.method1();// 오버라이딩; 1234
			p1.b();
			p1.a();
			//-자식 클래에서 오버라이딩된 부모클래스의 원본메서드를 호출할려면?
			
			//2.객체 생성;부모- 자식: 부모의 자원만 쓸수 있다(?)
			Bird p2 = new Parrot();
			System.out.println(p2.str1);
			//System.out.println(p2.str2); 자식 클래스 --- Err
			p2.a();
			p2.method1(); //오버라이딩은 자식 메서드도 
			//p2.b(); Err
			//-자식 클래스 메서들을 호출하고싶다

			//3.부모-부모 
			Bird p3 = new Bird();
			p3.method1();
			p3.a();
			//p3.b(); Err
			
			// 자식 클래스로 생성 
			//Parrot p4 = new Bird(); Err
			
			
		}

}
