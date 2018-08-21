package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	
	public void open() throws Exception{
		//OnlyneJr
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://node170328-onlynejr.jelasticlw.com.br/bdOnlyneJr", "root", "XDFvta08552");
		
	}
	
	
	public void close() throws Exception{
		con.close();
	}

}
