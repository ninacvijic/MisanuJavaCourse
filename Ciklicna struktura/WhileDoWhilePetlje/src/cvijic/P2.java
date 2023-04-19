package cvijic;

public class P2 {

	// Razlika izmedju i++ i ++i
	
	public static void main(String[] args) {
	

		int i = 0;
		while (++i < 5){ // uvećaj pa poredi
		System.out.println(i); // ispis uvećane vrednosti za i
	}
	}     // 4x se izvrsi
}

//int i = 0;
//while (i++ < 5){ // poredi pa uvećaj
//System.out.println(i); // ispis uvećane vrednosti za i
//} 
// 5x se izvrsi
