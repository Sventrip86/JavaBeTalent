package it.beTalent.entity;

public class Rettangolo {
	
	public double base;
	public double altezza;
	
	// Costruttore della classe Rettangolo
	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
	
	// Calcola e restituisce l'area del rettangolo
	public double calcoloArea() {
		double area = base * altezza;
		return area;
	}
	
	// Confronta due rettangoli in base alle loro aree e restituisce il rettangolo con l'area maggiore
	public static Rettangolo compara(Rettangolo rett1, Rettangolo rett2) {
		double area1 = rett1.calcoloArea();
		double area2 = rett2.calcoloArea();
		
		if (area1 > area2) {
			return rett1;
		} else {
			return rett2;
		}
	}
	
	// Restituisce una rappresentazione testuale del rettangolo
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	}
}
