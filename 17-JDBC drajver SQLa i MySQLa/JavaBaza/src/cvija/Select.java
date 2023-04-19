package cvija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;      //paziti da mi se ovaj Statement importuje, bio neki drugi pa nije radilo!

public class Select {

	public static void main(String[] args) {
		
		// adresa gde se nalazi baza sa kojom zelimo da se povezemo
		// korisnicko ime servera kome pristupamo
		// lozinka servera kome pristupamo
		                                             
		String url = "jdbc:mysql://localhost:3306/tb";     //putanja   //tb je baza sa kojom se povezujemo
	    String username = "root";                          
		String password= "";                               //ne smije biti razmak "  " !   
		
		//paziti na importe gore!, importovati plavo i - interface (npr za Connection)  //ctrl+shift+O
        try(Connection conn = DriverManager.getConnection(url, username, password)){  //ctrl+space
        	//DriverManager bude crvenim podvucen, i onda klik da mi napravi catch blok automatski!
        	
        	System.out.println("Uspesna konekcija ka bazi.");
        	
        	String sqlselect = "SELECT * FROM korisnici";    // upit
        	
        	Statement stmt = conn.createStatement();  //objekat za komunikaciju sa bazom
        	
        	ResultSet result =  stmt.executeQuery(sqlselect);  // izvrsavanje(namena)
        	
        	while(result.next()) {                                  //primary key ne navodimo jer je autoinkrement, a indeks za tu kolonu je 1, pocinje od 1 i ide s leva na desno
        		String ki = result.getString(2);  //indeks kolone  //ki skraceno za korisnickoIme iz baze
        		String lo = result.getString(3);
        		String ime = result.getString(4);
        		String email = result.getString(5);
        		
        		StringBuilder builder = new StringBuilder();
        		builder.append("Korisnicko ime: ");   // nazivi, dodali da vizuelno bolje izgleda
        		builder.append(ki);
        		
        		builder.append("\nLozinka: ");
        		builder.append(lo);
        		
        		builder.append("\nIme: ");
        		builder.append(ime);
        		
        		builder.append("\nEmail: ");
        		builder.append(email);
        		
        		System.out.println(builder.toString());
        	}
        	
        } catch(SQLException e) {
        	e.printStackTrace();
        }
        
	}

}
