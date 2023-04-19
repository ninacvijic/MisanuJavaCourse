package cvija;

// ova nova klasa koju pravimo je adapter

public class CurkaAdapter implements Patka { // *ovde dodajemo implements Patka!!!
	
	// Prvo se implementira interfejs tipa prema kojem se vrsi prilagodjavanje.
	// To je interfejs koji klijent ocekuje. 
	
	Curka curka; // objekat klase Curka, tj interfejsa???  // ali nesto kao tip podataka? 
	
	// 2.korak: Dobiti referencu na objekat koji prilagodjavamo
	// to radimo praveci konstruktor!
	
	public CurkaAdapter(Curka curka) { // konstruktor  // sto je ovo u zagradi???
	this.curka = curka;
}
	
	// 3. Implementacija metoda u interfejsu
	// Ovde se u stvari radi: Prevodjenje metode kvace() u metodu curlice() izmedju klasa
	
	public void kvace() {    // ovo su metode interfejsa Patka
		curka.curlice();  //*novo  // poziva metodu iz interfejsa Curka
		
	}

	public void leti() {
		for(int i = 0; i < 5; i++ ) // koristimo for petlju, tj ponavljamo letenje da bismo ih izjednacili u letu
			                         // jer jedna leti, a druga samo kratka rastojanja
		{                            // proizvoljne vrednosti u for petlji
			curka.leti();
		}
	}
	
}
//bune me ovi objekti!!!
//pitati Branka da pogleda!!!