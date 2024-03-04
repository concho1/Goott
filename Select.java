package gott;

import java.sql.*;
import java.util.*;


public class Select {
	public static void main(String[] args) {
		// 오라클 데이터베이스와 연결하는 객체
		Connection con = null;
		
		// SQL문을 데이터베이스에 전송하는 객체.
		PreparedStatement pstmt = null;
		
		//SQL문을 실행한 후에 결과값을 가지고 있는 객체.
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "goott";
		String password = "992992";
		
		try {

			// 1단게 : 오라클 드라이버를 동적으로 메모리로 로딩
			// 동적 로딩 : 프로그램을 실핼 할 때 드라이버를 로딩.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("오라클 드라이버 로딩 성공");
			
			//2단계 : 자바와 오라클 데이터베이스와 연결 시도(진행).
			con = DriverManager.getConnection(url, user, password);
			if(con != null) {
				System.out.println("오라클 데이터베이스 연결 성공");
			}
			
			// 3단계 : 데이터베이스에 전송할 SQL문을 작성
			String sql = "select * from MEMBER order by MEMBER_NUMBER desc";
			pstmt = con.prepareStatement(sql);
			
			// 4단계 데이터베이스에 SQL 문 전송
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt("member_number"));
				
			}
			
			rs.close(); pstmt.close(); con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
