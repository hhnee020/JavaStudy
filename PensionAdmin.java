package db1;



import java.io.*;
import java.sql.*;
import java.util.Scanner;
import comm.ConOracle;

public class PensionAdmin {

	public static void main(String[] args) throws Exception {

			Scanner scn = new Scanner(System.in);
			System.out.println("[팬션관리시스템 관리자모드]\n");
			System.out.println("1.룸(등록/변경)처리");
			System.out.println("2.룸목록(전체)");
			System.out.println("3.예약목록");
			System.out.print("\n>>서비스번호선택:");
			int number = scn.nextInt();
		
			if( number == 1 ) {  roomImport();  } 
			else if(number == 2) {  roomList(); }
			else if(number == 3) {   }
	}
	public static void roomImport() throws Exception {
		
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);
		
		System.out.print(">>등록(변경)처리 하시겠습니까?(Y/N)");
		String str = scn.next();
		
		if(str.toUpperCase().equals("Y")) {
			
			String path = "c:/Temp/pension_data.txt";
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			String rowdata = "";
			int cnt = 0;
			String[] datas = new String[5]; 
			while(true) {
				rowdata = br.readLine();
				if(rowdata == null) break;
				
				if(cnt == 0) {   } 
				else {
					String[] ar = rowdata.split(":");
					datas[cnt-1] = ar[1];
					if(cnt == 5) {
						
						String sql1 = "select count(*) cnt_room from room_info where rno='"+datas[0]+"' ";
						ResultSet rs1 = stmt.executeQuery(sql1);
						rs1.next();
						int cnt_room = rs1.getInt("cnt_room");
						
						String sql2 = "";
						if(cnt_room == 0) {
						     sql2 = "insert into room_info(rno,name,size1,price,pnum) "
							+ " values('"+datas[0]+"',"
									+ "'"+datas[1]+"',"
									+ "'"+datas[2]+"',"
									+ "'"+datas[3]+"',"
									+ "'"+datas[4]+"') ";
						} else {
							sql2 = "update room_info set "
											+ "	name='" +datas[1]+"'"
											+ " size1='"+datas[2]+"'"
											+ " price='"+datas[3]+"'"
											+ " pnum='" +datas[4]+"' "
										+ " where "
										+ "		rno='"+datas[0]+"'";
						}
						stmt.executeUpdate(sql2);
	
					}
				}
				cnt++;
				if( cnt == 6 ) cnt = 0;
			}
	
		} else {
			System.out.println("-- 종료합니다. --");
		}
	}
	
	public static void roomList() throws Exception {
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);
		
		String sql = "select 	rno||'호('||name||')' r_info ,"
				+ "				size1,"
				+ "				to_char(price,'FM999,999')||'원' price ,"
				+ "				pnum||'명' pnum "
				+ "		from room_info "
				+ "			order by rno asc";
		ResultSet rs = stmt.executeQuery(sql);
		int rownum = 0;
		while( rs.next() ) {
			rownum++;
			String r_info = rs.getString("r_info");
			String size1 = rs.getString("size1");
			String price = rs.getString("price");
			String pnum = rs.getString("pnum");

			System.out.print( rownum+ ". " + r_info + " " );
			System.out.print( size1 + " " );
			System.out.print( price + " " );
			System.out.println( pnum + " " );
		}
		
	}
	
	public static void reserveList() throws Exception {
		Statement stmt = ConOracle.dbconnect();
		Scanner scn = new Scanner(System.in);

		
	}
	
	
	
}
