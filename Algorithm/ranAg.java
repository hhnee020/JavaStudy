class ranAg {
    
    public static void main(String[] args) {
        // 정수 배열 선언

        int[] ar = new int[10];
        
        // 반복문을 돌면서 랜덤으로 10개의 정수 값 셋팅 - Math.random()

 
        for(int i=0; i< ar.length ; i++){

            ar[i] = (int)(Math.random()* 10); // 무작위 숫자 반환 (double)
            //System.out.println( (int)(Math.random()* 10) );
            System.out.print(ar[i]+"");

        }

         // 최댓값 ,최솟값 변수 초기화;
    
            int max = ar[0];
            int min = ar[0];

            // 반복문 비교

            for(int i=0; i<ar.length;i++){
                // 최댓값
                if( max < ar[i] ){
                    max = ar[i];
                }
                //최솟값 
                if(min > ar[i]){
                    min = ar[i];
                }

            }

            System.out.println("ar 배열 최댓값 " + max  +" ar 배열 최솟값 " + min);
    }
}
