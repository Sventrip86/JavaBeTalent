package it.beTalent.utility;

public class MetodiArray {
	
	
	public double modulo(double[] numeri) {   // PRIMO METODO : modulo dei numeri più piccoli
		
		double risultato = numeri[0] % numeri[1];
		
		return risultato;
		
	}
	
	public int somma(double[] numeri) {   // SECONDO METODO : somma i due più piccoli
		
		double risultato = numeri[0] + numeri[1];
		
		return (int)risultato;
		
	}
	
	public static String showResults(double modulo, int somma) {
		
		String result = ("Il risultato del modulo è: " + modulo + "Mentre la somma e': "+ somma) ;
		return result;
	}
		
		
	
	
	


}
