package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		

		String url = "jdbc:mysql://localhost:3306/tb";    //isto
	    String username = "root";
		String password= "";
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Uspesna konekcija ka bazi!");
                                                                                                               //updatujem na osnovu korisnickogImena
			String sqlupdate = "UPDATE korisnici SET lozinka = ?, ime = ?, email = ? where korisnickoIme = ?"; //vidim prvo u php-u kako bi izgledao upit, ali ga ne odradim, vec ovde upisem preko upitnika
			
			PreparedStatement ps = conn.prepareStatement(sqlupdate);
			ps.setString(1, "123korisnik");      //sad je indeks lozinke broj 1, na osnovu redosleda u update-u
			ps.setString(2, "Neko");
			ps.setString(3, "neko@gmail.com"); 
			
			ps.setString(4, "korisnik1");  //uslov   //korsinickoIme,zadnje, jer je u where uslovu, pa je indeks 4
			
			int promenjenPodatak = ps.executeUpdate();
			
			if(promenjenPodatak > 0)
			{
				System.out.println("Uspesno je izvrsena izmena!");
			}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// Run, pa u Select, pa opet Run u Select klasi
}       //ne moze se pregledno videti sta smo uradili u phpu sada naknadno, jer sam vec to sve na kraju promenila i obrisala!!!
}