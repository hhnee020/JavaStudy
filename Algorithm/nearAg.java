// 근삿값 알고리즘; 차잇값

class nearAg {
    /// 절대값
    public static int Abs(int num){
    return( num < 0 ) ? - num : num ;
    /// 0  보다 작으면 -num 
    };




    public static void main(String[] args) {
    // 

    int min = Integer.MAX_VALUE;

    int[] numbers={ 10, 20, 30 ,27 , 17 };
    int near =0;
    int target=25; //가장 가까운 값 ;



    for( int i=0; i<numbers.length; i++ ){
        int abs = Abs(numbers[i]- target); // 차이
        if( abs < min){
            min = abs;
            near = numbers[i];
        }

    }
    System.out.println(target + " 가장 가까운 값 "  + near);


    }
}
