

import java.io.*;
import java.util.Scanner;




public class Main {

	

	public static void Insert() {
	
	
	
	Scanner scn = new Scanner(System.in);
	System.out.println("등록할 내용을 입력해주세요.");
	System.out.println(">> 학생명 : " );
	String name = scn.next();
	
	System.out.println(">> 생년월일 : " );
	String ymd = scn.next();
	
	System.out.println(">> 핸드폰번호  : " );	
	String phone = scn.next();	
	
	String txt = name+ "/"+ ymd+ "/"+ phone;
	String fileName = "/Users/hani/text.txt";
	
	try{
		
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file, true);
		fw.write(txt);
		fw.close();
		
		}
		catch(Exception e){
		System.out.println("  잘못 입력 하셨습니다 ");
		
	}
		System.out.println(" 저장완료; ");
	}
			
			
	public static void slist() throws Exception  {
		
	
		Scanner scn = new Scanner(System.in);
		String file =  "/Users/hani/text.txt";
		FileReader fr = new FileReader(file);
		BufferedReader buffer = new BufferedReader(fr);
		
		
		System.out.println();
		System.out.println("   이름  출생년도   핸드폰  " );
		System.out.println(" ----------------------" ); 
         
		 String rowData =  " ";
         
		 while(true) {
			 rowData = buffer.readLine();
         if( rowData  == null ) break;
         String[] str = rowData .split("/");
         System.out.print(str[0] + "   ");
         System.out.print(str[1].substring(0,4) + "년생  ");
         System.out.println(str[2]);
		}
		
	}
    
	
	public static void sdetail() throws Exception  {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("  검색 이름을 입력해주세요 " );
		String search = scn.next();
		FileReader file = new  FileReader ("/Users/hani/text.txt");
		BufferedReader buffer = new BufferedReader(file);
		
		
		 String rowData =  " ";
         
		 int cnt = 0;
		 
         	while(true) {
         		rowData = buffer.readLine();
         		if( rowData == null ) break;
                if( rowData.indexOf(search) > -1 ) {
                   cnt = 1;
                   String[] str = rowData.split("/");
                   System.out.println("학생명 : " + str[0]);
                   System.out.println("출생일 : " + str[1]);
                   System.out.println("핸드폰 : " + str[2]);
                   break;
                }
         	}

            if(cnt == 0) {
                System.out.println("검색 이름을 찾지 못했습니다.");
             }
          }
	
	
	 public static void sDelete() throws Exception {
		 
		 System.out.println();
	     System.out.print("* 삭제할 이름을 입력해주세요. >>");
	     Scanner scn = new Scanner(System.in);
	     String search = scn.next();
		 
	     String file =  "/Users/hani/text.txt";
	     FileReader fr = new FileReader(file);
	     BufferedReader buffer = new BufferedReader(fr);
	     
	     String rowData =  " ";
	     String content = "";
	     
	      int cnt = 0;
	      while(true) {
	    	 rowData = buffer.readLine();
	         if( rowData == null ) break;
	         if( rowData.indexOf(search) == -1 ) {
	            content += rowData+"\r\n";
	         } else cnt = 1;
	      }
	      if(cnt == 0) {
	         System.out.println("검색 이름을 찾지 못했습니다.");
	      } else {
	         FileWriter fw = new FileWriter(file,false);
	         fw.write(content);
	         fw.close();
	         System.out.println("*삭제처리완료*");
	      }
	     
	     
	 }
	


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		Scanner scn = null;
		
		System.out.println(" [  회원 정보 관리 프로그램 ] ");
		System.out.println( " 1. 등록  2. 목록 3. 상세  4. 삭제 ");
		
		
		System.out.println(">> 번호 선택 :  ");
		
		
		scn = new Scanner(System.in);
		
		int number = scn.nextInt();
		
		
		switch (number) {
		case 1:
			
			System.out.println(" 1.등록;");
			Insert();
					
			break;
			
		case 2:
			System.out.println("2. 목록 ");		
			slist();
			
			
			break;
		case 3:
			System.out.println("3. 상세 ");
			sdetail();
			
			break;	
		case 4:
			System.out.println("4. 삭제 ");
			sDelete();
			
			break;		
			
		
			default:
			
		
			System.out.println(" 없는 번호 입니다 .");
			
			break;
		
		
		
		}
		
		System.out.println(  );
	}

}
