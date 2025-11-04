package personnages;

public class Village {

	private String nom;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, Gaulois chef, int capaciteMaxVillage) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[capaciteMaxVillage];
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;

	}

	public Gaulois getChef() {
		return chef;

	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			gaulois.setVillage(this);
			nbVillageois++;

		} else {
			System.out.println("Il n'y a plus d'espace dans le village !");
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		int i = numVillageois - 1;
		if (i >= 0 && i < nbVillageois) {
			return villageois[i];

		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}

	}

	public void afficherVillageois() {
		System.out
				.println("Dans le village " + nom + " du chef " + chef.getNom() + " vivent les légendaires gaulois :");

		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(" - " + villageois[i].getNom());

		}

	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);

		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);

		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);

		Gaulois gaulois2 = village.trouverVillageois(2);
		System.out.println(gaulois2);

		Gaulois DoublePolemix = new Gaulois("DoublePolémix", 4);

		village.afficherVillageois();

		abraracourcix.sePresenter();
		asterix.sePresenter();
		DoublePolemix.sePresenter();

	}

}
