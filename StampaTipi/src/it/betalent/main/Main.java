
/*Es 2 (esempio di nome: StampaTipi)
Creare un software che stampi un dato primitivo, un dato reference e un dato wrapper
*/

package it.betalent.main;

public class Main {
	
	public static void main (String[] args) {
		int numero = 36; //primitivo 
		String stringa = "Questa e' una stringa di tipo reference!"; // reference
		Integer numeroIntero = 40; // wrapper 
		
		
		System.out.println("Tipo di dato primitivo: " + numero);
		System.out.println("Tipo di dato reference: " + stringa);
		System.out.println("Tipo di dato wrapper: " + numeroIntero);

	}

}
