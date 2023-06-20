package it.beTalent.main;

import it.beTalent.entity.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto Scanner per l'input dell'utente
		Scanner scan = new Scanner(System.in);

		// Creazione di un array di oggetti Giorno con valori predefiniti
		Giorno[] giorni = {
			new Giorno("lunedi", 8),
			new Giorno("martedi", 9),
			new Giorno("mercoledi", 10),
			new Giorno("giovedi", 11),
			new Giorno("venerdi", 12),
			new Giorno("sabato", 13),
			new Giorno("domenica", 14)
		};
		
		System.out.print("Inserisci un giorno della settimana: ");
		String giorno = scan.nextLine();
		
		// Scansione dell'array di giorni alla ricerca del giorno inserito dall'utente
		for(Giorno g : giorni) {   
			if (g.nome.equals(giorno)) {	
				System.out.println("Il numero del giorno della settimana corrente per " + giorno + " è " + g.numero);
				break;
			}
		}
	}
}
