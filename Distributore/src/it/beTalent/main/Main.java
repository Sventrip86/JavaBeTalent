package it.beTalent.main;


import it.beTalent.entity.Pompa;
import it.beTalent.entity.Automobile;


public class Main {

	public static void main(String[] args) {
		
		
		Pompa pompa1 = new Pompa(4000);
		
		Automobile auto1 = new Automobile();
		Automobile auto2 = new Automobile();
		
		System.out.println("La pompa di benzina contiene : " + pompa1.cisterna + " litri" );
		
		
		pompa1.cisterna = auto1.rifornimento(20, pompa1.cisterna );
		
		
		
		
		System.out.println("Eseguito rifornimento e ora la pompa di benzina contiene : " + pompa1.cisterna + " litri" );
		
		pompa1.cisterna = auto2.rifornimento(70, pompa1.cisterna );
		
		System.out.println("Eseguito rifornimento e ora la pompa di benzina contiene : " + pompa1.cisterna + " litri" );
		
		

		
		
		

	}

}
