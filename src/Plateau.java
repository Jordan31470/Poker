import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Plateau {
	// private HashMap<String,Carte> cartes;
	private List<Carte> mainPile;
	private List<Carte> middle;
	private List<Joueur> joueurs;
	
	
	public Plateau(ArrayList<Carte> pile1, ArrayList<Carte> pile2, ArrayList<Carte> middle) {
		this.joueurs = new ArrayList<Joueur>();
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
	public void distribuer() {
		int rang = (int) (Math.random() * 10 );
		this.joueurs.get(0).recupererCarte(this.mainPile.get(rang));
		this.mainPile.remove(this.mainPile.get(rang));
		int rang1 = (int) (Math.random() * 10 );
		this.joueurs.get(0).recupererCarte(this.mainPile.get(rang1));
		this.mainPile.remove(this.mainPile.get(rang1));
		int rang2 = (int) (Math.random() * 10 );
		this.joueurs.get(1).recupererCarte(this.mainPile.get(rang2));
		this.mainPile.remove(this.mainPile.get(rang2));
		int rang3 = (int) (Math.random() * 10 );
		this.joueurs.get(1).recupererCarte(this.mainPile.get(rang3));
		this.mainPile.remove(this.mainPile.get(rang3));
	}
	
	
	//méthode qui distribue 5 cartes communes aux 2 joueurs
	public void distribuerMiddle() {
		for(int i = 0; i<5;i++) {
			int rang = (int) (Math.random() * 10 );
			this.middle.add(this.mainPile.get(rang));
			this.mainPile.remove(this.mainPile.get(rang));
		}
		for(int i = 0; i<5;i++) {
			this.joueurs.get(0).recupererCarte(this.middle.get(i));
		}
		for(int i = 0; i<5;i++) {
			this.joueurs.get(1).recupererCarte(this.middle.get(i));
		}
	}
	
	
	
	
}
