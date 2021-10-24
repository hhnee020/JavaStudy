// 가장 큰값  최댓값

class maxAg {
    
    public static void main(String[] args) {
        
        // 1 초기화
        int max = Integer.MIN_VALUE; //  정수 형식의 데이터 중 가장 작은 값 ;

        // 2 input
        int[] numbers ={ -2 , -5, -3, -7 , -1};
        
        // 3 process  max
        for( int i =0; i< numbers.length; i++){
            if( numbers[i] > max ){
                max = numbers[i]; // max 더 큰 값으로  할당 ; 

            }

        }
        
        // 4 output
        System.out.print("최댓값" +max);
    
    }

}
