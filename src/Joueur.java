import java.util.ArrayList;
import java.util.List;

public class Joueur {
	
	private String nom;
	private List<Carte> cartes;
	
	public Joueur(String nom, List<Carte> cartes) {
		this.nom = nom;
		this.cartes = cartes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}
	
	public void recupererCarte(Carte carte) {
		this.cartes.add(carte);
	}
	
}
