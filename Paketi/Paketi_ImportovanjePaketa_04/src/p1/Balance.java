package p1;

public class Balance {
	
	String name;
	double bal;
	
	public Balance(String n, double b){  // i ovde mora biti public!!
		name = n;
		bal = b;
	}
	
	public void show() { // mora public biti inace ne radi!!! // zbog vidljivosti
		if(bal < 0)  
			System.out.print("U minusu: \n");
		System.out.println(name + " = " + bal);
	}

}
