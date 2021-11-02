import java.util.Arrays;

class sortAg2 {
    public static void main(String[] args) {
        
        int[] score={ 80,88,98,100,76,55,17,67};
        
        // 성적 배열 , 오름차순 정렬 Arrays.sort(); -- 오름차순 기본 정렬 imporrt
        // 클래스 메서드로 array 클래스의  인스턴트 생성없이 바로 사용 가능
        System.out.print(" 정렬 전 : ");

        for(int i=0; i<score.length; i++){
            System.out.print( score[i] +" ");
        }
    
        Arrays.sort(score);

        System.out.print( " 정렬 후 : ");
        for(int i=0; i< score.length; i++ ){
            System.out.print( score[i] +" ");
        }

        System.out.println();
        
        // 향상된 for문
        System.out.print( " 정렬 후 : ");
        for(int i:score)
           // System.out.print(score[i]); //err
                System.out.print(i+" ");


    }
}
