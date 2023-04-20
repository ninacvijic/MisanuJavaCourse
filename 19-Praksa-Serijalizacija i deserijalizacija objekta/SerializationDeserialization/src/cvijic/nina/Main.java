package cvijic.nina;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException { // za serijalizacija i za deserijalizaciju treba ili throws Exception ili try catch blok

		User user = new User("Nina", "nina123", "ncv@gmail.com", 30);
		String fileName = "KorisnikInfo.ser";

		// Serijalizacija: mehanizam pretvaranja stanja objekta u tok bajtova(prednost:perzistentnost stanja objekta)

		// cuvanje objekta u file-u(.ser)
		FileOutputStream fileOut = new FileOutputStream(fileName); // (Refresh da se prikaze file unutar Projecta)
		ObjectOutputStream out = new ObjectOutputStream(fileOut); // Klasa ObjectOutputStream sadrzi metodu writeObject() za serijalizaciju objekta.
												
		out.writeObject(user);

		out.close();
		fileOut.close();

		System.out.println("Objekat je serijalizovan!\n" + "Podaci prije deserijalizacije: ");
		System.out.println(user.toString());
		
		User.g = 33; // promijenjena vrijednost static varijable
		

		// Deserijalizacija: obrnuti proces od serijalizacije, u kojem se tok bajtova koristi za ponovno kreiranje stvarnog objekta u memoriji

		 user = null; // ne dodjeljuje se vrijednost objektu
						
		// citanje objekta iz file-a
		FileInputStream fileIn = new FileInputStream(fileName); 
		ObjectInputStream in = new ObjectInputStream(fileIn); // Klasa ObjectInputStream sadrži metodu readObject() za deserijalizaciju objekta.

		user = (User) in.readObject();   // kastovanje

		in.close();
		fileIn.close(); 
		
		System.out.println("------------------------------------------------------");
		System.out.println("Objekat je deserijalizovan!\n" + "Stanje nakon deserijalizacije: ");
		System.out.println(user.toString());
		
		System.out.println("------------------------------------------------------");
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println("SerialVersionUID: " + serialVersionUID);
		

	}

}
