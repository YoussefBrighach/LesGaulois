package personnages;

import objets.Equipement;

public class Gaulois {

	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Village village;
	private Equipement[] trophees = new Equipement[100];

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

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}

	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

//	public void frapper(Romain romain) {
//
//		int forceCoup = (force * effetPotion) / 3;
//
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup(forceCoup);
//		effetPotion--;
//
//		if (effetPotion < 1) {
//			effetPotion = 1;
//		}
//
//	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;

	}

	@Override
	public String toString() {
		return nom;
	}

	public void setVillage(Village village) {
		this.village = village;

	}

	public void sePresenter() {
		if (village == null) {
			System.out.println("Le Gaulois " + nom + ": Bonjour je m'appelle " + nom + ". Je voyage de villages en villages.");
		} else {
			if (this == village.getChef()) {
				System.out.println("Le Gaulois " + nom + ": Bonjour je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".");
			} else {
				System.out.println("Le Gaulois " + nom + ": Bonjour je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".");
			}
		}
	}

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);

	}
}
