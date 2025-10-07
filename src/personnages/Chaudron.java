package personnages;

public class Chaudron {
	
	private int quantitePotion;
	private int forcePotion;
	
	
	
	public Chaudron(int quantitePotion, int forcePotion) {
		super();
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	
	public boolean resterPotion(int quantitePotion) {
		if (quantitePotion == 0) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	
	

}
