import java.util.ArrayList;
import java.util.List;

public class Joueur {
	
	private String nom;
	private ArrayList<Carte> cartes;
	private int nbCartes;
	
	public Joueur(String nom, ArrayList<Carte> cartes, int nbCartes) {
		this.nom = nom;
		this.cartes = cartes;
		this.nbCartes = nbCartes;
	}

	public int getNbCartes() {
		return nbCartes;
	}

	public void setNbCartes(int nbCartes) {
		this.nbCartes = nbCartes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.cartes = cartes;
	}
	
	public boolean relancer() {
		//a completer
		return true;
	}
	
	public boolean seCoucher() {
		//a completer
		return true;
	} 
	
}
