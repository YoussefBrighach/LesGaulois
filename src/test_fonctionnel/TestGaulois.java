package test_fonctionnel;

import java.security.PublicKey;

import personnages.Chaudron;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 16);
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		Chaudron chaudron = new Chaudron(4, 2);
		Druide panoramix = new Druide("Panoramix",2, chaudron);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		

		asterix.parler("Bonjour Ob�lix.");
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tr�s bonne id�e.");
		
		System.out.println("Dans la for�t " + asterix.getNom() +" et " + obelix.getNom() + 
				" tombent nez � nez sur le romain " + minus.getNom() + ".");
		
		for(int i = 0; i < 3; i++) {
			asterix.frapper(brutus);

		}
	}
}
