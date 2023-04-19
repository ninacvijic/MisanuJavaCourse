package cvija;

import predmeti.Predmet;  // prosli domaci rad!!!***

/*
3. Napisati klasu polica i tom prilikom predvideti: 
- stvaranje police sa zadatim brojem mesta za stavljanje predmeta i zadatom dozvoljenom najvećom
težinom svih predmeta na polici, 
- stavljanje predmeta na zadato mesto I na prvo slobodno mesto na polici, 
- uzimanje predmeta sa zadatom mesta na polici (predmet se uklanja sa police)
- pristup predmetu n adatom mestu na polici (predmet ostaje na polici)
- ispitivanje da li je neko mesto na polici prazno, 
- dohvatanje podataka o stanju police (kapacitet, broj popunjenih mesta, nosivost, ukupan teret na polici I
Koliko tereta može još da se doda), 
- sastavljanje tekstualnog opisa police, 
- pražnjenje police. 
U main klasi ispitati kreirane klase. 
*/

public class Polica {
	
	private Predmet[]niz; // niz za smestanje predmeta
	private double maxQ; //nosivost police
	private double q = 0; // trenutna opterecenost police
	
	public Polica(int kap, double Qmax) {  // inicijalizacija
		niz = new Predmet[kap];
		maxQ = Qmax;
	}
	
	public Polica stavi(Predmet p, int i) throws GreskaPolicaIndeks, GreskaPolicaZauzeto, GreskaPolicaTezina {   //stavljanje na dato mesto
		if(i<0 || i>=niz.length) throw new GreskaPolicaIndeks(i);
		if(niz[i] != null) throw new GreskaPolicaZauzeto(i);
		if(q + p.Q() > maxQ) throw new GreskaPolicaTezina(p);
		niz[i] = p;
		q += p.Q();
		return this;
	}
	
	public Polica stavi(Predmet p) throws GreskaPolicaTezina, GreskaPolicaPuna{  //stavljanje na prvo slobodno mesto
		if(q + p.Q() > maxQ) throw new GreskaPolicaTezina(p);
		int i = 0;
		while(i<niz.length && niz[i] != null)
			i++;
		if(i == niz.length) throw new GreskaPolicaPuna();
		niz[i] = p;
		q += p.Q();
		return this;
	}
	
	public Predmet uzmi(int i) throws GreskaPolicaIndeks, GreskaPolicaPrazno{ // uzimanje sa datog mesta
		if(i<0 || i>=niz.length) throw new GreskaPolicaIndeks(i);
		if(niz[i] == null)  throw new GreskaPolicaPrazno(i);
		Predmet p = niz[i];
		niz[i] = null;
		q -= p.Q();
		return p;
	}
	
	public Predmet dohvati(int i) throws GreskaPolicaIndeks, GreskaPolicaPrazno {  // dohvatanje na datom mestu
		if(i<0 || i>= niz.length) throw new GreskaPolicaIndeks(i);
		if(niz[i] == null) throw new GreskaPolicaPrazno(i);
		return niz[i];
	}
	
	public boolean prazno(int i) throws GreskaPolicaIndeks {  // da li je mesto prazno?
		if(i<0 || i>=niz.length) throw new GreskaPolicaIndeks(i);
		return niz[i] == null;
	}
	
	public int kapacitet() {  //kapacitet police
		return niz.length;
	}
	
	public int slobodno() {  // broj slobodnih mesta
		int k = 0;
		for(int i = 0; i<niz.length; i++)
			if(niz[i] == null)
				k++;
		return k;
	}
	
	public int zauzeto() {   // broj zauzetih mesta
		return kapacitet() - slobodno();
	}
	
	public double nosivost() {  // nosivost police
		return maxQ;
	}
	
	public double teret() {  // ukupan teret na polici
		return q;
	}
	
	public double jos() {  // dozvoljeni dodatni teret
		return maxQ - q;
	}
	
	public String toString() {   // tekstualni opis
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<niz.length; i++)
			if(niz[i] != null)
				sb.append(i).append(".  ").append(niz[i]).append('\n');
		return sb.toString();
	}
	
	public Polica prazni() {  //praznjenje police
		for(int i = 0; i<niz.length; niz[i++]=null);
		q = 0;
		return this;
	}

}
