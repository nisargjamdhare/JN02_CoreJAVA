package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
  static Connection cn;
  static {
	  try {
	  Class.forName("com.mysql.cj.jdbc.Driver"); 
	  System.out.println("driver loaded sucessfully......");
     cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PVG","root","962356");
  
      System.out.println("inserting records");
	  }catch(ClassNotFoundException | SQLException e){
		  e.printStackTrace();
	  }
  }
  public static Connection getCn() {
	  return cn;
  }
}
