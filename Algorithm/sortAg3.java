
import java.util.Arrays;
import java.util.Collections;

class sortAg3 {
    
    public static void main(String[] args) {
        

        // 내림차순 조건 을 설정 할때 기본 형 배열은 적용이 안된다.
        // 래퍼 클래스로 만들 어서 적용해야 한다. 

        Integer[] scores ={88,90,32,57,70,100,15};

        //내림차순 정렬  Arrays.sort() import 필요 
        // 배열명 ,컬렉션 reverseOrder 
        // Collection 클래스의 reverseOrder() 메서드 사용 import'
        
        System.out.print( "정렬하기 전 ");
        for(int i=0 ; i<scores.length; i++)
            System.out.print( scores[i] +" ");
    
        Arrays.sort( scores, Collections.reverseOrder() );
        
        System.out.print( "정렬하기 후 ");
        
        for(int i=0 ; i< scores.length; i++)
                    System.out.print( scores[i] +" ");

    }
}
