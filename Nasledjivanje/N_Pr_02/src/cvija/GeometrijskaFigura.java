package cvija;

public abstract class GeometrijskaFigura {  // apstraktna klasa je jer ne znamo kako da izracunamo povrsinu i obim!

	public double povrsina;
	public double obim;

	public abstract double izracunajPovrsinu();  // 2 apstr.metode apstraktne klase

	public abstract double izracunajObim();

}
