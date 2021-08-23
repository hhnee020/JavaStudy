package java100;

class Humam1{
	// 속성 
	String name;
	private int age;
	private int height;
	private int weight;
	
	int gender ;// private 바로 접근 불가;
	//생성자
	Humam1(){}
	Humam1( String name, int age, int height, int weight ){
		
		this.name =name;
		this.age = age;
		this.height= height;
		this.weight= weight;
		
		
	}
	// 중간다리 역활;
	public void setName( String name ) {
		this.name = name; }
	
	public String getName( ) { //setter를 호출만 하는 역활 이므로 리턴값 ;
		return name;
	}
	
	public void setAge( int age) {
		
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setHeight ( int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
		
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	
	}
	public int getWeight() {
		return weight;
	}
	//////////////////////////////////////////

	public void move() {
		
		System.out.println( "moving ");
		
	
	}

}