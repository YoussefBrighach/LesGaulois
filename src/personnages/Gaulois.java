package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {

		int forceCoup = (force * effetPotion) / 3;

		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(forceCoup);
		effetPotion--;

		if (effetPotion < 1) {
			effetPotion = 1;
		}

	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;

	}

	@Override
	public String toString() {
		return nom;
	}

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);

	}
}
