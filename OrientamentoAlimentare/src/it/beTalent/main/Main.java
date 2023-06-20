/* ES 11 
Classe Persona con attributo orientamento alimentare (onnivoro, vegetariano). Dati in ingresso 4 piatti (String)
Usare il controllo ternario per determinare se una persona consuma il pasto o no.
 */


package it.beTalent.main;

import it.beTalent.entity.Persona;
import it.beTalent.entity.Piatto;

public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto Persona con il nome "Giorgio" e impostazione del vegetariano su true
		Persona persona1 = new Persona(true, "Giorgio");
		
		// Creazione di oggetti Piatto con specifiche diverse
		Piatto piatto1 = new Piatto(true, "insalata");
		Piatto piatto2 = new Piatto(false, "carbonara");
		Piatto piatto3 = new Piatto(true, "minestrone");
		Piatto piatto4 = new Piatto(false, "lasagna");
		
		
		// Chiamate al metodo "mangia" dell'oggetto Persona per mangiare i piatti
		persona1.mangia(piatto1, persona1);
		persona1.mangia(piatto2, persona1);
		persona1.mangia(piatto3, persona1);
		persona1.mangia(piatto4, persona1);
	}
}
