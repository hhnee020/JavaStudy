import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class StuAdmin {

	public static void main(String[] args) throws Exception {

		Scanner scn = null;
		
		System.out.println("[ 회원정보관리 프로그램 ]");
		System.out.println("1.등록   2.목록   3.상세   4.삭제");
		
		int number = 0;
		while(true) {
			try {
				scn = new Scanner(System.in);
				System.out.print("*서비스 번호 선택 >>");
				number = scn.nextInt();
				break;
			} catch( Exception e ) {
				System.out.println("숫자입력이 아닙니다.");
			}
		}
		
		switch(number) {
		
		case 1 : stuInsert();
			break;
		case 2 : stuList();
			break;
		case 3 : stuDetail();
			break;
		case 4 : stuDelete();
			break;
		default :
			System.out.println("없는 번호 입니다.");
		}
	}
	public static void stuDelete() throws Exception {
		System.out.println("--------------");
		System.out.println("|   삭제하기   |");
		System.out.println("--------------");
		System.out.println();
		System.out.print("* 삭제할 이름을 입력해주세요. >>");
		Scanner scn = new Scanner(System.in);
		String search_text = scn.next();

		String path = "c:/Temp/stu_db.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String data = "";
		String content = "";
		int cnt = 0;
		while(true) {
			data = br.readLine();
			if( data == null ) break;
			if( data.indexOf(search_text) == -1 ) {
				content += data+"\r\n";
			} else cnt = 1;
		}
		if(cnt == 0) {
			System.out.println("검색 이름을 찾지 못했습니다.");
		} else {
			FileWriter fw = new FileWriter(path,false);
			fw.write(content);
			fw.close();
			System.out.println("*삭제처리완료*");
		}
	}
	public static void stuDetail() throws Exception {
		System.out.println("--------------");
		System.out.println("|   상세화면   |");
		System.out.println("--------------");
		System.out.println();
		System.out.print("* 검색 이름을 입력해주세요. >>");
		Scanner scn = new Scanner(System.in);
		String search_text = scn.next();

		String path = "c:/Temp/stu_db.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String data = "";
		int cnt = 0;
		while(true) {
			data = br.readLine();
			if( data == null ) break;
			if( data.indexOf(search_text) > -1 ) {
				cnt = 1;
				String[] str = data.split("/");
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
	public static void stuList() throws Exception {
		
		String path = "c:/Temp/stu_db.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		System.out.println();
		System.out.println(" 이름    출생연도      핸드폰  ");
		System.out.println("--------------------------");
		String data = "";
		while(true) {
			data = br.readLine();
			if( data == null ) break;
			String[] str = data.split("/");
			System.out.print(str[0] + "   ");
			System.out.print(str[1].substring(0,4) + "년생  ");
			System.out.println(str[2]);
		}
	}
	public static void stuInsert() throws Exception {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("--------------");
		System.out.println("|   등록화면   |");
		System.out.println("--------------");
		System.out.println("등록할 내용을 입력해주세요.");

		int err_cnt = 0;
		
		System.out.print("학생명 >>");
		String name = scn.next().trim();
		if(name.equals("")) err_cnt++;
		
		System.out.print("생년월일 >>");
		String birth = scn.next();
		if(birth.equals("")) err_cnt++;
		
		System.out.print("핸드폰 >>");
		String phone = scn.next();
		if(phone.equals("")) err_cnt++;
		
		String data = name+"/"+birth+"/"+phone+"\r\n";
		
		String path = "c:/Temp/stu_db.txt";
		if( err_cnt == 0 ) {
			FileWriter fw = new FileWriter(path,true);
			fw.write(data);
			fw.close();
			System.out.println("*저장완료*");
		} else {
			System.out.println("*저장실패 비어있는 데이터 존재*");
		}
	}
}


