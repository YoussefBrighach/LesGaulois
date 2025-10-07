package personnages;

public class Druide {

	private String nom;
	private int force;
	private Chaudron chaudron;

	public Druide(String nom, int force, Chaudron chaudron) {
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	

	public void fabriquerPotion(int quantite, int forcePotion) {

		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concoct� " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + " .");
	}
	
	
	

	public void booster(Gaulois gaulois) {

		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();

		if (contientPotion == true) {

			if (nomGaulois == "Ob�lix") {
				parler("Non, " + nomGaulois + " Non !... Et tu sais tr�s bien !");

			} else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois + " un peu de potion magique.");

			}

		} else {

			parler("D�sol� " + nomGaulois + "il n'y a plus une seule goutte de potion.");

		}

	}

}
