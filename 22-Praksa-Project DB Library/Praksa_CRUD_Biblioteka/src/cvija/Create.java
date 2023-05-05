package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/praksa_biblioteka";       
	    String username = "root";
		String password= "";
		
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Uspesna konekcija ka bazi.");
			
			String sqlinsert = "INSERT INTO autori(autorID, imeAutora, prezimeAutora)values(?, ?, ?)";  
			
			PreparedStatement ps = conn.prepareStatement(sqlinsert);   
			ps.setInt(1, 3);              
			ps.setString(2, "Ivo");          
			ps.setString(3, "Andric");
			
			int unetPodatak = ps.executeUpdate();
			
			if(unetPodatak > 0)
			{
				System.out.println("Podatak je upisan!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
