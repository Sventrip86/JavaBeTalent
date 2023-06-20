package it.beTalent.entity;

public class Persona {
	
	public boolean vegetariano;
	public String nome;
	
	// Costruttore della classe Persona con entrambi i parametri
	public Persona(boolean vegetariano, String nome) {
		super();
		this.vegetariano = vegetariano;
		this.nome = nome;
	}
	
	// Costruttore della classe Persona con un solo parametro
	public Persona(String nome) {
		this.nome = nome;
	}
	
	// Metodo che rappresenta una persona che mangia un piatto
	public void mangia(Piatto piatto, Persona persona) {
		// Verifica se sia il piatto che la persona sono vegetariani
		String risultato = (piatto.vegetariano == true && persona.vegetariano == true)
				? persona.nome + " mangia il piatto: " + piatto.nome
				: persona.nome + " non mangia carne!";
		System.out.println(risultato);
	}
}
