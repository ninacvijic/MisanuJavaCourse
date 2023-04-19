package p1;

public class BankAccount {
	
	private int pocVr;
	private int trVr;
	private int suma;
	
	public BankAccount() {
		pocVr = 0;
	}
	
	public BankAccount(int a, int t, int s) {
		pocVr = a;
		trVr = t;
		suma = s;
	}
	
	public int Sum(int a, int s) {
		int t = a + s;
		return t;
	}
	
	public int getTrVr() {
		return trVr;
	}
	
	public String toString() {
		return "Vase trenutno stanje iznosi: " ;
	}

	public int getPocVr() {
		return pocVr;
	}

	public void setPocVr(int pocVr) {
		this.pocVr = pocVr;
	}

	public int getSuma() {
		return suma;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}
	
	

}
