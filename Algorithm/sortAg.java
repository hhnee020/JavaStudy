// 정렬 알고리즘 ; 데이터를 왼쪽에서 순서 대로

class sortAg {
    
    public static void main(String[] args) {
        
        // 선택적 알고리즘 ;
        int[] data ={ 3,2,1,5,4};

        int N = data.length; // (의사 코드)슈도 코드 ;  알고리즘표현 하기 위해;
        
        ///
        for(int i=0; i< N-1 ; i++){ // i=0  to n-1
            
            for(int j=i+1 ; j < N ; j++){ // j=i+1 to n
                if(data[i] > data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    
                }


            }
        
        }


        for(int i=0; i<= N; i++){
            System.out.print( data[i] + "\t" );


        };

    

    }
}
