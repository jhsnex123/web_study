package jdbcexam.exam2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectImage {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Scanner scan = new Scanner(System.in);
				PreparedStatement pstmt = conn.prepareStatement("SELECT filename, imgcontent FROM imgtest WHERE filename = ?");) {
			System.out.print("읽으려는 이미지의 파일명을 입력하세요 : ");
			String name = scan.nextLine();
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				String imgName[] = rs.getString("filename").split("\\.");	// 정규표현식--> split("\\.");배열로 분리시키는애 주로 !공백! 조건:슬래쉬(백도 가능) 2개를 쓰고 그 뒤에 붙은 기호로 분리
				File imgFile = new File("c:/Temp/"+imgName[0]+new Date().getTime()+"."+imgName[1]); //new Date().getTime() 타임스태프 기능 파일 뒤에 시간이 붙는 기능
				InputStream is = rs.getBinaryStream("imgcontent"); // 읽어올떄는 set말고 get(받다)으로 받음
				FileOutputStream fos = new FileOutputStream(imgFile);
				byte[] b = new byte[2048];
				int n;
				while ((n = is.read(b)) > 0) {
					fos.write(b, 0, n); 
				}
				fos.close();
			} else {
				System.out.print(name + "이라는 파일명으로 저장된 이미지가 존재하지 않습니다. ");
			}
			System.out.println("이미지 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
