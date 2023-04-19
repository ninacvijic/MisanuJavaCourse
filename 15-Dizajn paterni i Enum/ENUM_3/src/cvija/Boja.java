package cvija;

public enum Boja {  // pravimo u ovom primeru slozeniji Enum
	
	// RGB paleta boja***
	//moze se odrediti udeo svake boje
	//glavne narandz, zuta i zelena?
	// prof objasnio na snimku
	
	Crvena(200), Zelena(150), Plava(100), Crna(250), Bela(179), Zuta(124);
	// ovo u zagradama je udeo boja
	// izmedju boja obicni zarez
	// a ovde na kraju mora ;
	
	private int udeo;  //podatak
	
	Boja(int u){  // konstruktor
		udeo = u;
	}
	
	int getUdeo() {   // get metoda
		return udeo;
	}

}
