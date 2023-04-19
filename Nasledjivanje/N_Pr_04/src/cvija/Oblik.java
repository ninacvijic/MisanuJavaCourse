package cvija;

public abstract class Oblik {

	protected double povrsina;  // atribut povrsina- on cuva povrsinu oblika

	public abstract double uzmiPovrsinu(); // kada se metoda definise sa abstract,
	                                       // podredjena klasa mora obezbediti realizaciju ove metode
}
