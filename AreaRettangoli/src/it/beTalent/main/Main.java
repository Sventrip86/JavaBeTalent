package it.beTalent.main;

import it.beTalent.entity.Rettangolo;

public class Main {
	
	

	public static void main(String[] args) {
		
		
		Rettangolo rett1 = new Rettangolo(12 , 15);
		Rettangolo rett2 = new Rettangolo(78 , 45);
		
		
		
		
		
		//System.out.println(area1);
		
		Rettangolo rettangoloMagg = Rettangolo.compara(rett1, rett2);
		
        System.out.println("Il rettangolo con area maggiore è: " + rettangoloMagg);
		

		

	}

}
