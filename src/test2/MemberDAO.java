package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO implements DAOInterface{

	private Connection conn;
	private Statement stmt;
	private ResultSet rs; 
	
	
	MemberDAO(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Ŭ���� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ε� ����");
		}
	}
	
	private boolean connect() { 
		boolean cFlag=false;
		try {//Ŀ�ؼ��ڿ��� sql�� ����
			conn = DriverManager.getConnection
					(""+"jdbc:oracle:thin:@localhost:1521:orcl","system","11111111");
			cFlag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cFlag;
	}
	
	@Override
	public int insert(Object m) {
		MemberDTO a = (MemberDTO) m;
		if(connect()) {
			String sql = "insert into member1 values(?,?,?)";
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, a.getId());
				psmt.setString(2, a.getName());
				psmt.setString(3, a.getAddr());
				psmt.executeUpdate();
				
				int k = psmt.executeUpdate();
				return k;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("DB ���� ����");
		}
		return 0;
	}


	
	
}
