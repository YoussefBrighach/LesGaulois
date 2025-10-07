package personnages;

public class Chaudron {

	private int quantitePotion;
	private int forcePotion;

	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public boolean resterPotion() {

		if (quantitePotion == 0) {
			return false;
		} else {
			return true;
		}

	}

	public int prendreLouche() {

		while (quantitePotion > 0) {
			quantitePotion--;
		}

		if (quantitePotion == 0) {
			forcePotion = 0;
		}

		return forcePotion;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;

	}

}
