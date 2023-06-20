package it.beTalent.main;

import java.util.Arrays;
import java.util.Scanner;
import it.beTalent.utility.MetodiArray;

public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto Scanner per l'input dell'utente
		Scanner scan = new Scanner(System.in);
		
		// Creazione di un array di double con dimensione 4
		double[] numeri = new double[4];
		
		// Ciclo per l'inserimento dei numeri nell'array
		for (int i = 0; i < numeri.length; i++) {
			System.out.print("Inserisci un numero: ");
			Double numero = scan.nextDouble();
			numeri[i] = numero;
		}
		
		// Stampa dell'array di numeri
		System.out.println(Arrays.toString(numeri));
		
		// Ordinamento dell'array numeri
		Arrays.sort(numeri);
		
		// Creazione di un oggetto MetodiArray
		MetodiArray metodi = new MetodiArray();
		
		// Calcolo del modulo dei numeri e della loro somma
		double modulo = metodi.modulo(numeri);
		int somma = metodi.somma(numeri);
		
		// Generazione della stringa di risultati utilizzando il metodo showResults di MetodiArray
		String risultati = metodi.showResults(modulo, somma);
		
		// Stampa dell'array di numeri ordinato e dei risultati
		System.out.println(Arrays.toString(numeri));
		System.out.println(risultati);
	}
}
