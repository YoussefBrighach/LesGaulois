package test_fonctionnel;

import java.security.PublicKey;

import personnages.Chaudron;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		Chaudron chaudron = new Chaudron(4, 3);
		Druide panoramix = new Druide("Panoramix", 2, chaudron);

		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tr�s bonne id�e.");

		System.out.println("Dans la for�t " + asterix.getNom() + " et " + obelix.getNom()
				+ " tombent nez � nez sur le romain " + minus.getNom() + ".");

		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);

		}
	}
}
