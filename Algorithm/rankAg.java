/* 순위 알고리즘 */
// 주어진 지정한 일정 조건 구한다;


class rankAg {
    
    public static void main(String[] args) {

        int[] scores ={ 90,87,100,95,80};
        int[] rankings ={ 1,1,1,1,1 }; // 모두 1
        
        ///rank

        for(int i=0; i < scores.length; i++){
            rankings[i] =1; // 1등으로 초기화 ;

            for( int j =0; j < scores.length; j++){
                if(scores[i]< scores[j]){ //현재 와 나머지 j  비교
                    // 나보다 큰 점수가 나오몀 1증가 
                    rankings[i]++;

                };

            };

        }
        ///
        for(int i=0; i<scores.length; i++){
            
            System.out.println( scores[i] + " 점 " + rankings[i]+"등" );


        };
        

    }

}
