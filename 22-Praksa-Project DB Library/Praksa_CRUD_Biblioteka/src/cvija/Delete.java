package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/praksa_biblioteka";    
	    String username = "root";
		String password= "";
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Uspesna konekcija!");

			String sqldelete = "DELETE FROM autori WHERE autorID = ?";
			
			PreparedStatement ps = conn.prepareStatement(sqldelete);
			ps.setInt(1, 3);
			
			
			int obrisanPodatak = ps.executeUpdate();
			
			if(obrisanPodatak > 0)
			{
				System.out.println("Uspesno je obrisan podatak!");
			}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		

	}

}
