package jdbcexam.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectData2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement();					
				Scanner scan = new Scanner(System.in);){
		    System.out.print("학생 이름을 입력하세요 : ");
		    String name = scan.nextLine();
		    ResultSet rs = stmt.executeQuery("select score from student where name = '"+name+"'");  // scan으로 값을 받을려면  '"+name+"' 문자열값은 이렇게 표현
			if(rs.next())        // executeQuery -> resultset 값이랑 같이 쓰면 try catch with source 내용을 못받음 직접 입력해야함
				System.out.println(name + "학생의 점수 : " + rs.getInt("score"));
			 else 			
				 System.out.println(name + "학생에 대한 데이터가 없습니다.");
			 System.out.println("수행 종료...");
			 rs.close();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
