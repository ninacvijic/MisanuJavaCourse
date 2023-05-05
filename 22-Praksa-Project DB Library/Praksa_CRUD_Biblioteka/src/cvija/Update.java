package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/praksa_biblioteka";   
	    String username = "root";
		String password= "";
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Uspesna konekcija ka bazi!");
                                                                                                               
			String sqlupdate = "UPDATE autori SET  autorID = ?, imeAutora = ? where prezimeAutora = ?";
			
			PreparedStatement ps = conn.prepareStatement(sqlupdate);
			ps.setInt(1, 3);     
			ps.setString(2, "Vladimir");
			
			ps.setString(3, "Andric");  
			
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
