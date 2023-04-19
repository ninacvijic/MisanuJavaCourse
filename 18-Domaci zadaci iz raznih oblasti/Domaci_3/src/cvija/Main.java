package cvija;

public class Main {

	public static void main(String[] args) {

		RandomNum rn = () -> {

			double num = Math.random();
			return num;
		};

		System.out.println("Nasumicno izabran broj je: " + rn.random());

	}

}
