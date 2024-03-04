package gott;

import java.sql.*;
import java.util.*;


public class Insert {
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
			
			/*
			Scanner sc = new Scanner(System.in);
			System.out.println("회원 아이디를 입력하세요");
			String id = sc.nextLine();
			System.out.println("회원 비밀번호를 입력하세요");
			String pw = sc.nextLine();
			System.out.println("회원 이름을 입력하세요");
			String name = sc.nextLine();
			System.out.println("회원 나이를 입력하세요");
			String age = sc.nextLine();
			System.out.println("회원 직업을 입력하세요");
			String job = sc.nextLine();
			*/
			
			
			// 3단계 : 데이터베이스에 전송할 SQL문을 작성
			String sql = "select max(MEMBER_NUMBER) from MEMBER";
			pstmt = con.prepareStatement(sql);
			
			// 4단계 데이터베이스에 SQL 문 전송
			rs = pstmt.executeQuery();
			
			int cnt = 0;
			
			if(rs.next()) {
				cnt = rs.getInt(1);
				System.out.println("마지막 number " + cnt);
			}
			/*
			 * SQL문이 select 쿼리문인 경우
			 * ==> executeQuery() 메서드를 이용해야 함
			 * ==> 반환형은 ResultSet 타입으로 반환.
			 * 
			 * SQL문이 insert update, delete인 경유
			 * ==> executeUpdate()를 사용
			 * 반환타입은 int 타입
			 * ==> 
			 */
			
			sql = "insert into MEMBER values(?,?,?,?,?,?,?,?,sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ++cnt);
			pstmt.setString(2, "asdasd");
			pstmt.setString(3, "asdasd123");
			pstmt.setString(4, "홍길동2");
			pstmt.setInt(5, 27);
			pstmt.setInt(6, 0);
			pstmt.setString(7, "선생님");
			pstmt.setString(8, "서울시");
			//pstmt.setDate(9, sqlDate);
			
			int i = pstmt.executeUpdate();
			System.out.println(i);
			
			sql = "select * from MEMBER order by MEMBER_NUMBER desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt("member_number"));
			}
			
			sql = "commit";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
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
