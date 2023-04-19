package cvijic.nina;

public class SamePackage {
	
	SamePackage(){  // u konstruktoru pravimo objekat klase Base!!!, jer uzimamo podatke iz klase Base, pa stampamo
		Base b = new Base();
	System.out.println("Konstruktor klase SamePackage");
	//System.out.println("n_pri = " + b.n_pri);      // jedino ovo se nece moci odstampati, jer je private(a private ne dijeli sa drugom klasom, jedino private polje nije vidljivo)
	System.out.println("Same package klasa: n_def = " + b.n_def);  // mora biti poziv pomocu objekta b. !
	System.out.println("Same package klasa: n_pro = " + b.n_pro);
	System.out.println("Same package klasa: n_pub = " + b.n_pub);
	}

}

// kad u SamePackage kreiramo objekat Base klase ono ispiše ponovo sve ono što je već ispisano jednom. // zato je 2x u Consoli ispis za Base, a 1x za Same
// kreiranjem objekta dobijemo sve ovako naštampano 