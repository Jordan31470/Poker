import java.util.ArrayList;
import java.util.List;

public class Joueur {
	
	private String nom;
	private ArrayList<Carte> cartes;
	
	public Joueur(String nom, ArrayList<Carte> cartes) {
		this.nom = nom;
		this.cartes = cartes;
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
		
	
}
