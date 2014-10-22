import java.sql.*;
import javax.swing.*;
public class Connction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection c = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:C:\\sqllite\\student.db");
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Opened database successfully");
	}

}
