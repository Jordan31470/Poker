import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Plateau {
	// private HashMap<String,Carte> cartes;
	private List<Carte> mainPile;
	private List<Carte> pile1 ;
	private List<Carte> pile2;
	private List<Carte> middle;
	private List<Joueur> joueurs;
	
	
	public Plateau(ArrayList<Carte> pile1, ArrayList<Carte> pile2, ArrayList<Carte> middle) {
		this.joueurs = new ArrayList<Joueur>();
		this.pile1 = pile1;
		this.pile2 = pile2;
		this.middle = middle;
		this.mainPile.add(new Carte(Couleur.CARREAU,Valeur.TROIS));
		this.mainPile.add(new Carte(Couleur.TREFLE,Valeur.DIX));
		this.mainPile.add(new Carte(Couleur.CARREAU,Valeur.VALET));
		this.mainPile.add(new Carte(Couleur.PIQUE,Valeur.ROI));
		this.mainPile.add(new Carte(Couleur.COEUR,Valeur.DEUX));
		this.mainPile.add(new Carte(Couleur.COEUR,Valeur.DAME));
		this.mainPile.add(new Carte(Couleur.TREFLE,Valeur.ROI));
		this.mainPile.add(new Carte(Couleur.PIQUE,Valeur.QUATRE));
		this.mainPile.add(new Carte(Couleur.CARREAU,Valeur.AS));
	}
	
	
	
	//méthode qui distribue les 2 cartes par joueur
	public void distribuer(Carte carte, Joueur joueur) {
		this.mainPile.remove(carte);
		joueur.recupererCarte(carte);
	}
	
	//méthode qui distribue 5 cartes communes aux 2 joueurs
	
	
	
}
