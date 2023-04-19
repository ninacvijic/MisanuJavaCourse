package cvijic.nina;

public class Main {

	public static void main(String[] args) {
		
		
		FaktBr fb = (n) -> {
			
            int fact = 1;
            for (int i = 1; i <= n; i++)
            fact = i * fact;
            return fact;
        };

        System.out.println("Faktorijel broja 5 je: " + fb.factorial(5));

	}

}
