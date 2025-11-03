package personnages;

import objets.Equipement;

public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 : "La force du coup reçu est positive";
		int force_ancienne = force;
		force = force - forceCoup;

		if (force < 1) {
			force = 0;
			parler("J'abandonne !");

		} else {
			parler("Aïe");
		}

		assert force <= force_ancienne : "la force d’un Romain a diminué";

		assert isInvariantVerified() : "Invariant non vérifié : force négative";
	}

	private boolean isInvariantVerified() {
		return force >= 0;
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {

		default:
			System.out.println("ERREUR");
			break;

		case 0:
			ajouterEquipement(equipement);
			break;

		case 1:

			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + ".");
			} else {
				ajouterEquipement(equipement);
			}
			break;

		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		}

	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement + ".");

	}

	public static void main(String[] args) {

		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}

}