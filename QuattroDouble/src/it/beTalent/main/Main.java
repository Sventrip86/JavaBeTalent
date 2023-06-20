package it.beTalent.main;

import java.util.Arrays;
import java.util.Scanner;


import  it.beTalent.utility.MetodiArray;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] numeri = new double[4];
		
		
		for (int i=0; i< numeri.length ; i++) {
			
			System.out.print("Inserisci un numero: ");
			Double numero = scan.nextDouble();
			numeri[i] = numero;
			
		}
		
		System.out.println(Arrays.toString(numeri));
		
		Arrays.sort(numeri);
		
		MetodiArray metodi = new MetodiArray();
		
		double modulo = metodi.modulo(numeri);
		int somma = metodi.somma(numeri);
		
		
		String risultati = metodi.showResults(modulo, somma);
		
		
		
		
		System.out.println(Arrays.toString(numeri));
		System.out.println(risultati);
		
	}
		
		
		
	
		
		
		
		
		
		
		
		
		
		


}
