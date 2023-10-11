package jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

//import com.mysql.cj.xdevapi.Statement;

public class UsingStatement {

	 static Statement st;
	 
	 static {
		 try {
		 st =DBUtil.getCn().createStatement();
		 }catch(SQLException e){
			 e.printStackTrace();
			 
		 }
	 }
	public static void updateStudent(int rool_no , String name) 
	{
		
	}
	public static void deleteStudent(int rool_no) 
	{
		
	}
	public static void displayStudents() 
	{
		Resultset rs;
		try {
		rs= (Resultset) st.executeQuery("SELECT * from student");
		while(((ResultSet) rs).next()) {
			System.out.println(((ResultSet) rs).getInt(1)+"\t"+((ResultSet) rs).getString(2)+"\t");
		}
		}catch(SQLException e) {
			 e.printStackTrace();
		}
	}
	
}
