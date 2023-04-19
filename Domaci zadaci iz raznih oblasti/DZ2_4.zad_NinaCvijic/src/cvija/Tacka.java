package cvija;

/*
 4. Саставити на језику Јава следеће класе:
 
• Материјална тачка у простору се задаје помоћу реалне масе (подразумевано 1) и три реалне координате (подразумевано (0,0,0)).
 Може да се одреди растојање (r) до друге тачке, да се израчуна привлачна сила између тачке и 
 задате друге тачке (F=γ·m1·m2/r2, γ=6,67·10−11) и да се тачка испише на главном излазу
 */

public class Tacka {
	
	  public double m, x, y, z;
	  
	  public Tacka() {
	        m = 1;
	        x = 0;
	        y = 0;
	        z = 0;
	    }
	    
	    public Tacka(double mm, double xx, double yy, double zz) {
	        m = mm;
	        x = xx;
	        y = yy;
	        z = zz;
	    }
	    
	    public double r(Tacka T) {
	        return Math.sqrt(Math.pow(x-T.x, 2) + Math.pow(y-T.y, 2) + Math.pow(z-T.z, 2));
	    }
	    
	    public double F(Tacka T) {
	        return 6.67E-11 * m * T.m / Math.pow(r(T), 2);
	    }
	    
	    public void pisi() {
	        System.out.printf("[%f,(%f,%f,%f)]", m, x, y, z);
	    }

}
