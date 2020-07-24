package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Table {

	public static void main(String[] args) {
		
		System.out.println("1er Partie");
		//je Convertie les strings de ce tableau en entier et je les ins�rer dans une arraylist
		//J'Affiche l�arraylist
		String tabDeChaine[] = {"20", "-6", "-9" ,"8", "3", "2"};
		List<Integer> list = new ArrayList<>();

		for (String e : tabDeChaine) {
			list.add(Integer.parseInt(e));
		}
		//J'affiche l'arrayList
        	System.out.println(list);
		
   
        	System.out.println("2eme Partie");
		 //J'Ajoute dans un arraylist les num�ro fran�ais 
		 //J'Affiche l�arrayList
		 String num[] = {"0725836741","664631", "0497456321","0623654789" ,"5665653" , "04iyukjnlj", "04879631kk"};
		 ArrayList l = new ArrayList<>();
		 
		 for (String s : num) {
			 if ((s.substring(0, 2).equals("04")  || s.substring(0, 2).equals("06")) && s.length() == 10)
			 l.add(s);
		}System.out.println(l);
		
		
		System.out.println("3eme Partie");
		 //je cr�e une m�thode authentification Qui prend en param�tre notre HashMap<string, string>
		 //Et 2 String id et mp et retourne true si l�id et le mot de passe forme un �l�ment dans le hashmap 
		    HashMap<String, String> DB = new HashMap<String, String>();

	        DB.put("robocop", "187");
	        DB.put("anis", "1234");
	        DB.put("JosepDB", "666");
	        DB.put("facile", "007"); 
	        
	        if(authentification(DB, "anis", "1234")) System.out.println("authenfication ok");
	        
	        //Partie 5 : je cr�e une methode qui s'appel NEGATIF qui prend en parametres un arrayList d'entiers et
	        //qui retourne un arrayList rempli seulement par les entiers n�gatifs du l'arraylist rentr� en parametre
	        
	        
	        //Partie 6 :je cr�e une methode qui s'appel NEGATIFSCHAINE qui prend en parametres un arrayList de String et 
	        //qui les convertit en entiers qui retourne un arrayList rempli seulement par les entiers n�gatifs


	        //Partie 7
	    	//dans la classe test je cr�e une Hashmap qui s'appelle STOCK contient cl� = Produit / valeur = quantit�
	    	//dans la classe test je cr�e 2 m�thode qui permettent d'AUGMENTER ou de DIMINUER la quantit� d'un produit dans le stock
	    	//dans la classe je cr�e une m�thode qui s'appelle ACHETER qui prend en parametre le produit et la quantit� achet�e
	        HashMap<String, Integer> Stock = new HashMap<String, Integer>();
	        Stock.put("montre", 50);
	        Stock.put("chemise", 30);
	        Stock.put("pantalon", 10);
	        
	        
	        
	}	
	// METHODE AUGMENTER quantit� de produit
	static ArrayList<Integer> Augmenter(ArrayList<Integer> quantit�) {
		return quantit�;

	}
	
	// METHODE DIMINUER quantit� de produit
	static ArrayList<Integer> Diminuer(ArrayList<Integer> quantit�) {
		return quantit�;

	}
	
	// METHODE ACHETER
	static void Acheter(String Produit, int Qunatit�Acheter) {
		
	}
	// METHODE NEGATIFSCHAINE Partie 6
	static ArrayList<Integer> negatifsChaine(ArrayList<String> arrayListString) {
		ArrayList<Integer> arrayStrNegatif = new ArrayList<Integer>();
		
		for (String s : arrayListString) {
			if (Integer.parseInt(s) < 0) arrayStrNegatif.add(Integer.parseInt(s));
		}
		return  arrayStrNegatif;
		
	} 
	
	// METHODE NEGATIF Partie 5
	static ArrayList<Integer> negatif(ArrayList<Integer> arrayListEntier) {
		ArrayList<Integer> arrayEntNegatif = new ArrayList<Integer>(); 
		
		for (Integer entier : arrayListEntier) {
			if (entier < 0) arrayEntNegatif.add(entier); //AJOUTER L'ENTIER NEGATIF A LA LISTE d'entier n�gatif 
		}
		return arrayEntNegatif;	
	}
	
	//METHODE DE L'AUTHENTIFICATION
	static boolean authentification(HashMap<String, String> DB, String identifiant, String motDePasse) {
	        	for (String id : DB.keySet()) {
					if ( id.equals(identifiant) && DB.get(id).equals(motDePasse) ) { //id = cl� et DB.get(i) = la valeur de id
						return true;
					}
				}
	        	return false;
	}
	
}
