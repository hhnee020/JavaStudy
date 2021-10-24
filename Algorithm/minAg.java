/// 데이터 중에서 가장 짝수 값

class minAg {
    
    public static void main(String[] args) {
       int min = Integer.MAX_VALUE;
       // 정수형식의 데이터 중 가장 큰 값
        
       int[] numbers ={ 2,5,3,7,1};
       
       for( int i= 0; i< numbers.length; i++){
            if( numbers[i] < min && numbers[i] % 2 == 0){
                 min = numbers[i];

            }

       }

       System.out.print(min);

    }
}
