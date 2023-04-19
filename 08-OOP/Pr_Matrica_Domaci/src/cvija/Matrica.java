package cvija;

public class Matrica {

	private int rows;
	private int cols;
	private double[][] elements;

	Matrica(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		elements = new double[rows][cols];
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public void setElement(int row, int col, double value) {
		elements[row][col] = value;
	}

	public double getElement(int row, int col) {
		return elements[row][col];
	}

}

// link sa interneta na kojem sam nasla kako uraditi zadatak. // ima jos nekih opcija! --- prikaz matrice isprobati!!!***

//  https://github.com/skooter500/OOP-2016-2017/blob/master/java/matrix/ie/dit/Matrix.java
