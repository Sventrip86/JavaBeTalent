
/* ES 1 
Dati due rettangoli, calcolarne l’area e mandare in uscita da un metodo qual è il più grande.
*/
package it.beTalent.main;

import it.beTalent.entity.Rettangolo;

public class Main {
	
	public static void main(String[] args) {
		
		// Creazione di due oggetti Rettangolo con le dimensioni specificate
		Rettangolo rett1 = new Rettangolo(12 , 15);
		Rettangolo rett2 = new Rettangolo(78 , 45);

		// Calcolo del rettangolo con l'area maggiore utilizzando il metodo statico "compara"
		Rettangolo rettangoloMagg = Rettangolo.compara(rett1, rett2);
		
		// Stampa del rettangolo con l'area maggiore	
        System.out.println("Il rettangolo con area maggiore è: " + rettangoloMagg);	

	}

}
