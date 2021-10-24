// n 명의 점수중에서 88점 이상 95이하인 점수의 평균

/* 평균 알고리즘 */
// 주어진 범위에 주어진 조건에 해당하는 자료들 평균
class avgAg {
    
public static void main(String[] args) {
    //1 n명의 점수 

    int[] data={ 90, 65, 78,50, 95};
    int sum =0;
    int count =0;

    // 처리 avg = sum/count
    for( int i=0; i< data.length ; i++){
        if( data[i] >=80 && data[i] <= 95 ){
            sum +=  data[i]; // sum
            count++;
        }
    }
    double avg = sum/(double)count;

    // 
    System.out.print("" + avg);

}


}

