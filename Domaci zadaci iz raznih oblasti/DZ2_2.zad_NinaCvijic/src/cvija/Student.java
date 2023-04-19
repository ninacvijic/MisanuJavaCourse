package cvija;

/*
 Студент има име (текст произвољне дужине), број индекса (дугачак цео број по шеми ggggrrrr, где су g и r цифре године уписа и регистарског 
броја) и низ испита задатог капацитета (подразумевано 40). Ствара се без иједног испита после чега испити могу да се додају један по један. 
Повратна вредност при додавању испита показује успех додавања (тј. да ли је било места у низу испита). Не сме да се прави копија студента. Може да 
се израчуна средња вредност оцена положених испита и да се студент испише на главном излазу у облику "име[годУп/регБр:срОцена]".
 */

public class Student {
	
		  private String ime;
		  private long ind;
		  private Ispit[] ispiti;
		  private int kap, duz;

		  public Student (String ime, long ind, int k) {
		    this.ime = ime;
		    this.ind = ind;
		    this.ispiti = new Ispit[k];
		    this.kap = k;
		    this.duz = 0;
		  }

		  public boolean dodaj (Ispit isp) {
		    if (duz == kap) 
		    	return false;
		    ispiti[duz++] = isp;
		    return true;
		  }

		  public double srOcena () {
		    double s = 0; 
		    int n = 0;
		    for (int i=0; i<duz; i++)
		      if(ispiti[i].ocena().ocena() > 5) {
		        s+=ispiti[i].ocena().ocena();
		        n++;
		      }
		    if (n != 0) 
		    	s /= n;
		    return s;
		  }

		  public void pisi () {
		    System.out.print(ime + "[" + (ind/10000) + "/" + (ind%10000) + ":" + srOcena() + "]");
		  }
		}


