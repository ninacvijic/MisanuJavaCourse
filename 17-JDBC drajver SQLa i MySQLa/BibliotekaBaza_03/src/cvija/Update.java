package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/biblioteka";   
	    String username = "root";
		String password= "";
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Uspesna konekcija ka bazi!");
                                                                                                               
			String sqlupdate = "UPDATE biblioteke SET  bibliotekaID = ?, imeBiblioteke = ?, ulica = ? where broj = ?";
			
			PreparedStatement ps = conn.prepareStatement(sqlupdate);
			ps.setInt(1, 2);     
			ps.setString(2, "Narodna");
			ps.setString(3, "Kozarska"); 
			
			ps.setString(4, "14/08");  
			
			int promenjenPodatak = ps.executeUpdate();
			
			if(promenjenPodatak > 0)
			{
				System.out.println("Uspesno je izvrsena izmena!");
			}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
