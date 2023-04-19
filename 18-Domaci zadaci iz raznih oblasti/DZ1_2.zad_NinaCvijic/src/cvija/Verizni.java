package cvija;

/*
2. Napisati klasu verižnih razlomaka i tom prilikom predvideti: 
- stvaranje verižnog razlomka zadatog reda s koeficijentima jednakim nuli, 
- postavljanje vrednosti verižnog razlomka za zadatu vrednost nezavisno promenljive, 
- sastavljanje tekstualnog opisa verižnog razlomka koji sadrži koeficijente razlomaka. 
U main klasi ispitati kreirane klase. 
*/

public class Verizni {  // klasa veriznih razlomaka
	
	double[] a;    // koeficijenti razlomka
	
	public Verizni(int n) {    //inicijalizacija
		a = new double [n];
	}
	
	public Verizni postavi(int i, double b) throws IndeksException {  // postavljanje koeficijenta
		if(i<0 || i>=a.length) throw new IndeksException(a.length, i);
		a[i] = b;
		return this;
	}
	
	public double vr(double x) throws NulaException {  // vrednost razlomka
		double s = 0;
		for(int i = a.length-1; i>=0; i--) {
			if(x+s ==0) throw new NulaException();
			s = a[i] / (x+s);
		}
		return s;
	}
	
	@Override
	public String toString() {  // tekstualni opis
		String s = "Verizni[";
		for(int i =0; i<a.length; i++) {
			if(i>0)
				s+= ",";
			s += a[i];
		}
		return s + "]";
		
	}
	

}
