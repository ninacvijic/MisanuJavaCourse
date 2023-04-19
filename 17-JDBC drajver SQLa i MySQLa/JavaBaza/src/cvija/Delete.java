package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/tb";    //isto
	    String username = "root";
		String password= "";
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Uspesna konekciaj ka bazi!");

			String sqldelete = "DELETE FROM korisnici WHERE korisnickoIme = ?";
			
			PreparedStatement ps = conn.prepareStatement(sqldelete);
			ps.setString(1, "korisnik1");
			ps.setString(1, "ABC");     //dodala i ovo da obrisem, cisto da vidim, jer se sve promenilo!
			
			int obrisanPodatak = ps.executeUpdate();
			
			if(obrisanPodatak > 0)
			{
				System.out.println("Uspesno je obrisan podatak!");
			}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
         //Run, pa Select pa Run u Selectu
		 //pa sam dodala i ABC da se obrise i nista nije ostalo u bazi - Reload u Phpu i nema nista
		
		 //pa sam usla opet u Insert i isla Run, pa u Selectu Run i sad imam jedan podatak, samo se menja ID podataka, raste redosledom i ako je npr isto ime-on je jedinstveni identifikator
		//snimak!!!***
	}

}

//jedino se Select izvrsava bez parametara
//u ostalim upitima se ubacuju parametri
// ?(upitnici) zamenjuju neke parametre

//ne kucam nista u php-u nego se preko eclipse-a upise u php
