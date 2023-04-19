package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/tb";      //opet posebna konekcija, tako cemo za svaku klasu, a inace moze i 1 konekcija za sve!**
	    String username = "root";
		String password= "";
		
		System.out.println("Konekcija......");
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Uspesna konekcija ka bazi.");
			
			String sqlinsert = "INSERT INTO korisnici(korisnickoIme, lozinka, ime, email)values(?, ?, ?, ?)";  // upitnici zamenjuju vrednosti, za sad
			
			PreparedStatement ps = conn.prepareStatement(sqlinsert);   // ovde je preparedstatement! //import isto interfacea!!!
			ps.setString(1, "ABC");              //ovde sad konkretne vrednosti, nisu upitnici
			ps.setString(2, "pass123");          //ovde se za indeksiranje ne gleda sad tabela korisnici, vec ovaj raspored iznad u insert into, tu je na broju 1 korisnickoIme
			ps.setString(3, "Abc");
			ps.setString(4, "abc@gmail.com");
			
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

//klik na Run, imamo samo obavestenja da je podatak upisan
//vratim se u Select, pa na Run i tu vidim sta je konkretno upisano!!!
//pratiti i u phpMyAdminu kako se menja tabela!!!
