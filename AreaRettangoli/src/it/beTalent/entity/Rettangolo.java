package it.beTalent.entity;

public class Rettangolo {
	
	public double base;
	public double altezza;
	
	
	
	
	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
		
	}
	
	public double calcoloArea() {
		double area = base * altezza;
		return area;
	}
	
	public static Rettangolo compara(Rettangolo rett1, Rettangolo rett2) {
		
		double area1 = rett1.calcoloArea();
		double area2 = rett2.calcoloArea();
		
		if(area1 > area2) {
			return rett1;
		}else 
			{
			return rett2;
			}
	}
	
	
	  public String toString() {
	        return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	    }
	
	
	

}
