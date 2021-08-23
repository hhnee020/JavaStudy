package java100;



// getter ,setter; 행동은 메소드;

class Vn extends Humam1{
	
	private String unique_key;
	private int weapon;
	private double power;
	
	Vn(){}
	Vn( String unique_key, int weapon, double power){
		super();// 부모 클래스  생성자 초기화 ;
		this.weapon = weapon;
		this.power= power;
		this.unique_key =unique_key;
		
	}
	
	
	public void setUnique_key(String unique_key) {
		this.unique_key =unique_key;
		 
	}
	
	public String getUnique_key() {
		return unique_key;
	}
	
	public void setWeapon( int weapon) {
		this.weapon = weapon;
		
	}
	public int getWeapon() {
		return weapon;
	}
	
	public void setPower( double power) {
		this.power = power;
		
	}
	public double getPower() {
		return power;
	}
	////////////////// 
	
	
	
	public void print() {
		
		System.out.print( getName()+ " "+
							getWeaponName(getWeapon()) +" "+
							getPower() +" "+ getAge()+" " +  getUnique_key() +" "+
							getHeight()+" "+ getWeight() );
	}
	
	//getWeapon 가지고 있는것을 getWeaponName이 출력 ;
	
	public String getWeaponName( int a ) { // 인자값이 weapon이기 때 
		
		String weapon;
		switch(a){
			case 1:
				weapon ="창";
				break;
			case 2:
				weapon ="방패";
				break;
			case 3:
				weapon ="총";
				break;
				default:
					weapon ="------";
				break;
				
				
		}
		return weapon;// 받은 값을 출력하기 위해;
	}
	
}
class Hr extends Humam1 {}

public class superClass2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Humam1 h1 = new Humam1();
		Humam1 h2 = new Humam1();
		h1.setName("hani");
		h2.setName("haha");
	
	
		System.out.println( h1.getName()  +" "+ h2.getName()+""+ h1.getAge());
		
		Vn v1 = new Vn();
		
		v1.setName("좀비");
		v1.setAge(55);
		v1.setUnique_key("123");
		v1.setWeapon(4);
		v1.setPower(102.1);
		v1.setHeight(200);
		v1.setWeight(108);
		///
		System.out.println("  ");
		System.out.print( v1.getName()+" ");
		v1.move();
		
		
		
		//////////
		
		Vn v2 = new Vn();
		v2.setName("도깨비 ");
		v2.setAge(155);
		v2.setUnique_key("113");
		v2.setWeapon(2);
		v2.setPower(62.1);
		v2.setHeight(200);
		v2.setWeight(558);
		v2.print();
		System.out.println("  ");
		
		System.out.print( v2.getName()+"");
		v1.move();
		System.out.println();
	}

}
