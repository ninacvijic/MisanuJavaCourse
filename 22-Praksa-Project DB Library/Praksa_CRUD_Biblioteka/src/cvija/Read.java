package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/praksa_biblioteka";     
	    String username = "root";                          
		String password= "";                              
		
		
        try(Connection conn = DriverManager.getConnection(url, username, password)){  
        	
        	System.out.println("Uspesna konekcija...");
        	
        	String sqlselect = "SELECT * FROM autori";    
        	
        	Statement stmt = conn.createStatement();  
        	
        	ResultSet result =  stmt.executeQuery(sqlselect); 
        	
        	while(result.next()) {  
        		int id = result.getInt(1);  
        		String ime = result.getString(2);
        		String prezime = result.getString(3);
        		
        		StringBuilder builder = new StringBuilder();
        		
        		builder.append("ID: ");   
        		builder.append(id);
        		
        		builder.append("\nIme autora: ");
        		builder.append(ime);
        		
        		builder.append("\nPrezime autora: ");
        		builder.append(prezime);
        		
        		System.out.println(builder.toString());
        	}
        	
        } catch(SQLException e) {
        	e.printStackTrace();
        }

	

	}

}
