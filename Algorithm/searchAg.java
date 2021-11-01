/* 검색 알고리즘*/
// 이진검색 알고리즘 ; index scan

class searchAg {
    
public static void main(String[] args) {
        
        int[] data = {1,3,5,7,9};
        /// 오름차순 데이터 
        int N = data.length; // 의사 코드 ; 
        int search = 3; // 검색할 데이터
        boolean flag = false; // 찾앗으면 t 아니면 f
        int index = -1; // 찾은위치 


        int low =0; // min
        int high = N -1 ; //max
        while (low <= high ){ /// 만날때 까지
            int mid = (low +high )/2;  // 중간 인덱스 구하기
            if( data [mid] == search ){
                flag = true; index = mid ; break;
            }
        
            if( data[mid] < search){

                low = mid +1; // 찾을 데이터 가 크면 오른쪽으로 이동
            }else{
                high = mid  - 1; // 찾을 데이터가 작으면 왼쪽으로 이동;

            }
        }
        if(flag){

            System.out.println( search +"를"+ index + " 위치에서 찾았습니다 ");
        
        }else{
            System.out.println( " 찾지 못했씁니다 ");
        }


}
}
