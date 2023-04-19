package cvija;

// Nit se moze napraviti i kada klasu Thread prosirite novom nasledjenom klasom, 
// a zatim napravite instancu te klase.

// Nova potklasa mora da redefinise metodu run().

public class A extends Thread{
	
	public A (String s)  // pravimo konstruktor // moze i bez public
		{
		super(s); // poziva konstruktor Thread sledeceg oblika: public Thread(String imeNiti)
		}         // super je vezano za nasledjivanje  // pisemo samo s u zagradi, jer nasleduje i konstruktor
	
	public void run() {
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(getName());
		}
		
	}

}
