package it.beTalent.entity;

public class Portafoglio {
	
	public double denaro;
	public int valore;
	
	public Portafoglio(double denaro, int valore) {
		this.denaro = denaro;
		this.valore = valore;
	}
	
	
	
	
	public void calcoloPercentuale(double denaro, int valore) {
		
		double percentuale = valore * denaro / 100;
		
		System.out.println("Il " + valore + "% del totale del portafoglio:" + denaro + " euro e' uguale a: " + percentuale + " euro" );
		

	
		
	}

}
