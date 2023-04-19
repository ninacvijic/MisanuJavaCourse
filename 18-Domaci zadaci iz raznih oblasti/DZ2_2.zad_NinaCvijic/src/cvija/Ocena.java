package cvija;

import java.util.Arrays;

/*
 2. Написати на језику Јава следеће класе:
• Оцена садржи цео број у опсегу од 5 до 10. Вредности изван опсега приликом стварања промене се у најближу прихватљиву вредност. Може 
да се дохвати вредност оцене бројчано и словима као и да се оцена испише на главном излазу када се пишу оба облика оцене (на пример: 10(deset)).
 */

public class Ocena {
	
		  private int oce;
		  private static final String[] opisi = {"pet", "sest", "sedam", "osam", "devet", "deset"};

		  public Ocena (int oc) {
		    if (oc < 5) 
		    	oc = 5;
		    if (oc > 10)
		    	oc = 10;
		    oce = oc;
		  }

		  public int ocena () { 
			  return oce; 
			  }

		  public String opis () { 
			  return opisi[oce-5]; 
			  }

		  public void pisi () { 
			  System.out.print(oce + "(" + opis() + ")"); 
			  }
		}

