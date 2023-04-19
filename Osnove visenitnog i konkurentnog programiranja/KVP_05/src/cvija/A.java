package cvija;

public class A implements Runnable{
	
public void run() {
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(Thread.currentThread().getName()); 
		}
		
	}

}
