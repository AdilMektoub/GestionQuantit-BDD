package Collection;

		//je cr�e classe produit ( un produit est caract�ris� par son id, son noms)
public interface Produit {

	//dans la classe test je cr�e une Hashmap qui s'appelle STOCK contient cl� = Produit / valeur = quantit�
	//dans la classe test je cr�e 2 m�thode qui permettent d'AUGMENTER ou de DIMINUER la quantit� d'un produit dans le stock
	//dans la classe je cr�e une m�thode qui s'appelle ACHETER qui prend en parametre le produit et la quantit� achet�e

//	private int id;
//	private String nom;
	
	void Augmenter(int Quantite);
	void Diminuer (int Qauntite);
	void Acheter (Produit produit, int Quantite);

}	
