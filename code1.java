package CodeupTest;

public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int i = 1 ; i <= 5 ; i++ ){
			for( int j = 1 ; j <= i ; j++ ) {}
		}	
		
		
		////////////////
		
		for(int i = 1 ; i <= 5; i++){ 
	
			for(int j=1; j<i; j++){  
			  System.out.print("*");
			  }
			System.out.println("*");
		}
		
		/////////////////
		
		
		for(int i=1; i<5; i++){ 
			for(int j=1; j<i; j++){  
			  System.out.print("*");
			  }
			System.out.println("*");
		}
			  
			  
		//////////////
			  
	for ( int i = 1 ; i <= 5 ; i++ ){ // 전체줄
		
	    System.out.println();// 개행
	    
	    for( int j = 1 ; j <= 5-i ; j++ ) {
			System.out.print(" ");
		
	    	}////  num ( 5 )행 에서 i를 뺀 값 을 공백 ;
			
	        for( int k = 1 ; k <= i ; k++ ){
				System.out.print("*");
				
	            }
		
	}
		
	}
	}

