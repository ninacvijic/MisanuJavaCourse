package cvija;

public class Abs {

	public double broj;

	public double apsolutnaVrednost() {

		if (broj < 0)
			return -1 * broj;
		else if (broj > 0)
			return broj;
		else
			return 0;
	}

}
