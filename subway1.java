package data1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import comm.ConOracle;

public class Subway1 {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		System.out.println("[지하철 데이터 관리]");
		
		System.out.println("1. 데이터 저장");
		System.out.println("2. 데이터 조회");
		System.out.print("\n>>번호선택:");
	
		int number = scn.nextInt();
			 if(number == 1) {  subwayInsert();   }
		else if(number == 2) {  subwaySearchSelect();  }
	} 
	public static void subwayInsert() throws Exception {
		Statement stmt = ConOracle.dbconnect();
		String path = "c:/Temp/subway.csv";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String tbname="";
		String rowdata = "";
		int cnt = 0;
		while( true ) {
			cnt++;
			rowdata = br.readLine();
			if(rowdata == null) break;
			if(cnt > 1) {
				String[] ar = rowdata.split(",");
				if(ar[0].equals("line_1")) {
					tbname = "subway1";
				} else if(ar[0].equals("line_2")) {
					tbname = "subway2";
				} else if(ar[0].equals("line_3")) {
					tbname = "subway3";
				} else if(ar[0].equals("line_4")) {
					tbname = "subway4";
				}
				String sql = "INSERT INTO "+tbname+"(line,time,enter,getoff) "
						+ "   VALUES('"+ar[0]+"','"+ar[1]+"','"+ar[2]+"','"+ar[3]+"')";
				stmt.executeUpdate(sql);
			}
		}
		System.out.println("저장완료 끝 ~~");	
	}
	public static void subwaySearchSelect() throws Exception {

		Scanner scn = new Scanner(System.in);
		System.out.println("1.승차인원 전체출력");
		System.out.println("2.하차인원 전체출력");
		System.out.println("3.시간대별 조회");
		System.out.println("4.승차인원수별 출력(많은)");
		System.out.println("5.승차인원수별 출력(적은)");
		System.out.println("6.각 호선별 가장 많은 시간대와 승차인원");
		
		System.out.print(">>메뉴번호:");
		int number = scn.nextInt();
		
		     if( number == 1 ) { list1(); }
		else if( number == 2 ) { list2();  }
		else if( number == 3 ) { list3();  }
		else if( number == 4 ) { list4();  }
		else if( number == 5 ) { list5();  }
		else if( number == 6 ) { list6();  }
	}
	public static void list1() throws Exception {
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("- 호선별 승차인원 전체출력 -");
		System.out.print(">>호선입력:");
		int number = scn.nextInt();
		
		String sql = "select 	line,"
				+ "		substr(lpad(time,4,'0'),1,2)||':'||substr(lpad(time,4,'0'),3,2) time,"
				+ "				enter "
				+ "from subway"+number;
		ResultSet rs = stmt.executeQuery(sql);
		while( rs.next() ) {
			String line = rs.getString("line");
			String time = rs.getString("time"); // 08:09
			String enter = rs.getString("enter");
			System.out.println( line+" "+time+" "+enter );
		}
	}
	public static void list2() throws Exception {
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("- 호선별 하차인원 전체출력 -");
		System.out.print(">>호선입력:");
		int number = scn.nextInt();
		
		String sql = "select "
				+ "				line,"
				+ "		substr(lpad(time,4,'0'),1,2)||':'||substr(lpad(time,4,'0'),3,2) time,"
				+ "				getoff "
				+ "		from "
				+ "			subway"+number;
		
		ResultSet rs = stmt.executeQuery(sql);
		while( rs.next() ) {
			String line = rs.getString("line");
			String time = rs.getString("time"); // 08:09
			String getoff = rs.getString("getoff");
			System.out.println( line+" "+time+" "+getoff );
		}	
	}
	public static void list3() throws Exception {
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("- 시간대별 조회 -");
		
		System.out.print(">>호선입력:");
		int line = scn.nextInt();
		
		System.out.print(">>시간입력:");
		int time = scn.nextInt();  // 5,8,12xx,19
		
		String sql = "select "
				+ "			line,time,enter,getoff "
				+ "	   from "
				+ "			subway"+line 
				+ "    where  "
				+ "			time like '"+time+"%' ";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			String line1 = rs.getString("line");
			String time1 = rs.getString("time");
			String enter = rs.getString("enter");
			String getoff = rs.getString("getoff");
			System.out.print(line1+" ");
			System.out.print(time1+" ");
			System.out.print(enter+" ");
			System.out.println(getoff);
		}
	}
	public static void list4() throws Exception {
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("- 호선별 승차인원 전체출력(많은인원부터) -");
		System.out.print(">>호선입력:");
		int number = scn.nextInt();
		
		String sql = "select 	line,"
				+ "		substr(lpad(time,4,'0'),1,2)||':'||substr(lpad(time,4,'0'),3,2) time,"
				+ "				enter "
				+ "		from subway"+number
				+ "			order by enter desc";
		ResultSet rs = stmt.executeQuery(sql);
		while( rs.next() ) {
			String line = rs.getString("line");
			String time = rs.getString("time"); // 08:09
			String enter = rs.getString("enter");
			System.out.println( line+" "+time+" "+enter );
		}
	}
	public static void list5() throws Exception {
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("- 호선별 승차인원 전체출력(적은인원부터) -");
		System.out.print(">>호선입력:");
		int number = scn.nextInt();
		
		String sql = "select 	line,"
				+ "		substr(lpad(time,4,'0'),1,2)||':'||substr(lpad(time,4,'0'),3,2) time,"
				+ "				enter "
				+ "		from subway"+number
				+ "			order by enter ";  // asc 생략
		ResultSet rs = stmt.executeQuery(sql);
		while( rs.next() ) {
			String line = rs.getString("line");
			String time = rs.getString("time"); // 08:09
			String enter = rs.getString("enter");
			System.out.println( line+" "+time+" "+enter );
		}
	}
	public static void list6() throws Exception {
		
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("- 각 호선별 가장 많은 시간대와 승자인원 -");
		System.out.print(">>호선입력( 1,2,3,4,0(전체) ):");
		int number = scn.nextInt();  // 0
		
		String sql = "";
		if( number == 0 ) {
			sql = "  ( select line,time,enter from subway1  "
					+ "                where enter=(select max(enter) from subway1) )"
					+ "                union "
					+ "  ( select line,time,enter from subway2  "
					+ "                where enter=(select max(enter) from subway2) )"
					+ "                union "
					+ "  ( select line,time,enter from subway3  "
					+ "                where enter=(select max(enter) from subway3) )"
					+ "                union "
					+ "  ( select line,time,enter from subway4  "
					+ "                where enter=(select max(enter) from subway4) )";
		} else {
		
				sql = "  select 	line,"
					+ "		substr(lpad(time,4,'0'),1,2)||':'||substr(lpad(time,4,'0'),3,2) time,"
					+ "		enter "
					+ "	 from subway"+number
					+ "			where enter=(select max(enter) from subway"+number+")"; 
		}
		
		ResultSet rs = stmt.executeQuery(sql);
		while( rs.next() ) {
			String line = rs.getString("line");
			String time = rs.getString("time"); // 08:09
			String enter = rs.getString("enter");
			System.out.println( line+" "+time+" "+enter );
		}		
	}
}


 
