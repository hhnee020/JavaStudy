class minAg2 {
    
    public static void main(String[] args) {
    int[] ar ={ 1, 13, 150 ,17,-2};        
        // max min 함수;
        System.out.println(Math.max(10,4)); //10
        System.out.println(Math.min(10,4)); //4



        // 일단 배열내 첫번째 원소 의 값이 제일 작다고 가정 하고 초기화
		//int min = ar[0]; // 4
        int min= Integer.MAX_VALUE; // 가장 큰 값
		
		// 반복문 출력 이때 비교는 2번째부터 비교부터 하여 int 는 1로 시작한다 
		for(int i=1; i < ar.length; i++ ){
			
			if( min > ar[i] ){
					// 4 >  ar[ 1 ]
					// 4 > 13
				min = ar[i];
				// -2 = -2;
			}
			
		}
		System.out.println(" 가장 작은 값 " + min); 

    }
}
