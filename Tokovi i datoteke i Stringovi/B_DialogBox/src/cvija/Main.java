package cvija;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// uneti 2 vrednosti preko dialogboxa i zatim im zameniti vrednosti
		// zamena moze na vise nacina
		
		int a = 0, b = 0;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj: "));  // import gore
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj: "));
		
		a = a + b;  // zamena ??  - kaze prof ima i ovaj nacin!!!
		b = a - b;
		a = a - b;
		
	  JOptionPane.showMessageDialog(null, "Promena: " + a + " " + b);  // Ctrl + Space 
	                                                                  // tek kad sve do kraja unesem prestane se crveniti                       
	}

	}

