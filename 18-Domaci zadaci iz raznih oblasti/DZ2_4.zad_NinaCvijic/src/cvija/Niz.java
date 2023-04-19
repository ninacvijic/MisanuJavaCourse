package cvija;

/*
 • Низ материјалних тачака се ствара празан задатог почетног капацитета (подразумевано 5), 
 после чега се тачке додају једнa по једнa на крај низа. 
Aко се низ препуни, капацитет му се повећа за 5. Може да се дохвати број тачака у низу, 
да се дохвати тачка у низу која највише привлачи задату тачку и да се низ испише на главном излазу.
 */

public class Niz {
	
    private Tacka[] niz;
    private int kap = 5, duz;
   
    public Niz(int k) {
        niz = new Tacka[kap = k];
        duz = 0;
    }
    
    public Niz(Niz n) {
        niz = new Tacka[kap = n.kap];
        duz = n.duz;
        for (int i=0; i<duz; i++) {
            niz[i] = new Tacka(n.niz[i].m, n.niz[i].x, n.niz[i].y, n.niz[i].z);
        }
    }
    
    public int vel() {
        return duz;
    }
    
    public Niz dodaj(Tacka T) {
        if (duz == kap) {
            Tacka[] pom = new Tacka[kap += 5];
            for (int i=0; i<duz; i++) {
                pom[i] = niz[i];
            }
            niz = pom;
        }
        niz[duz++] = T;
        return this;
    }
    
    public Tacka maxF(Tacka T) {
        double max = T.F(niz[0]);
        int ind = 0;
        for (int i=1; i<duz; i++) {
            double F = T.F(niz[i]);
            if (F > max) {
                max = F;
                ind = i;
            }
        }
        return niz[ind];
    }
    
    public void pisi() {
        for (int i=0; i<duz; i++) {
            niz[i].pisi();
            System.out.println();
        }
    }

}
