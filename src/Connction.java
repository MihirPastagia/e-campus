import java.sql.*;

import javax.swing.*;

import java.net.*;
import java.io.*;

public class Connction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int port = Integer.parseInt(args[0]);
		int backlog=Integer.parseInt(args[1]);
		 Connection c = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:C:\\sqllite\\student.db");
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Opened database successfully");
		    Thread u=new server(port,backlog);
		    u.start();
	}

}


