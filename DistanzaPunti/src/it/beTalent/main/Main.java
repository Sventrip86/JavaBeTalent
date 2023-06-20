package it.beTalent.main;

import it.beTalent.entity.Punto;

public class Main {
	
	
	public static double calcolaDistanza(Punto p1, Punto p2) {
		double distanza = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
		return distanza;
	}

	public static void main(String[] args) {
		
		Punto p1 = new Punto(5, 15);
		
		Punto p2 = new Punto(78, 36);
		
		
		
		
		double distanza = calcolaDistanza(p1, p2);
		System.out.println("La distanza tra il punto1 e il punto2 e' : " + distanza);
		


	}

}
