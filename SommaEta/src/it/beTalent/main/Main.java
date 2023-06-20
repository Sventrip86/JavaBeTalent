/* Es 1  SommaEta
Creare due persone e mostrare la somma delle loro età. */
package it.beTalent.main;

import it.beTalent.entity.*;

public class Main {

	public static void main(String[] args) {


		Persona persona1 = new Persona(36);
		Persona persona2 = new Persona(40);
		
		int sommaEta = persona1.eta + persona2.eta;
        System.out.println("La somma delle eta' di persona1: " + persona1.eta + " e persona2: " + persona2.eta + " e': " + sommaEta);
			

	}

}
