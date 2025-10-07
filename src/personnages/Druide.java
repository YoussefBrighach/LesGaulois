package personnages;

public class Druide {
	
	private String nom;
	private int force;
	
	

	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le Druide " + nom + " : ";

	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		System.out.println("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de "+ forcePotion);
		
	}
	
	
	
	

}


