package cvijic.nina;

public class Balance {
	
	String name;
	double bal;
	
	Balance(String n, double b){  // konstruktor
		name = n;
		bal = b;
	}
	
	void show() {
		if(bal < 0)  // uslov u metodi
			System.out.print("U minusu: \n");
		System.out.println(name + " = " + bal);
	}

}
