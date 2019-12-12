import java.util.HashMap;

public class Carte {
	 
	
	
	private HashMap<String,Integer> valeur= new HashMap<String,Integer>();
	private Couleur couleur;
	private int nbCartes;
	public void valeur() {
		valeur.put("1", 1);
		valeur.put("2", 2);
		valeur.put("3", 3);
		valeur.put("4", 4);
		valeur.put("5", 5);
		valeur.put("6", 6);
		valeur.put("7", 7);
		valeur.put("8", 8);
		valeur.put("9", 9);
		valeur.put("10", 10);
		valeur.put("VALLET", 11);
		valeur.put("DAME", 12);
		valeur.put("ROI", 13);
		valeur.put("8", 14);
		
	   
	    System.out.println(valeur);		
	}
	

	
}
