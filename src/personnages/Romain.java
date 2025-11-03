package personnages;

public class Romain {

	private String nom;
	private int force;

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

	public static void main(String[] args) {

		Romain minus = new Romain("Minus", 6);

	}

}