/* 갯수 알고리즘 */
// 1~n개의 정수  : 13 

public class countAg{

    public static void main(String[] args) {
        
        // 1 input 1~1000
        int[] numbers ={11,12,13 ,13 , 15,13};
        int count =0; // 갯수를 저장할  변수



        //2 process 필터링
        for( int i= 0; i <numbers.length; i++){

            if( numbers[i] % 13 == 0 ){ /// 13의 배수라면 
                
                //count = count +1;
                count++;

            }

        }

        //3 output 
        System.out.println(
            numbers.length+ "개의 정수중 13의 배수의 개수 : " +count );

    }

}
