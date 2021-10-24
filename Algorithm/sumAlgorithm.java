

/*합계 알고리즘  */

public class sumAlgorithm {

    public static void main(String[] args) {

        // 1.input , 2.process 3. output
        
        int[] scores = { 100, 75, 50, 37, 90, 95 };
        int sum = 0;

        ///////////

        for( int i=0; i< scores.length; i++ ){

            if(scores[i] >= 80){
                sum+=  scores[i];
            }

        }
        System.out.println(scores.length+" 80 점이상 " + sum);
    }
}
