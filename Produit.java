package Collection;

		//je crée classe produit ( un produit est caractérisé par son id, son noms)
public interface Produit {

	//dans la classe test je crée une Hashmap qui s'appelle STOCK contient clé = Produit / valeur = quantité
	//dans la classe test je crée 2 méthode qui permettent d'AUGMENTER ou de DIMINUER la quantité d'un produit dans le stock
	//dans la classe je crée une méthode qui s'appelle ACHETER qui prend en parametre le produit et la quantité achetée

//	private int id;
//	private String nom;
	
	void Augmenter(int Quantite);
	void Diminuer (int Qauntite);
	void Acheter (Produit produit, int Quantite);

}	
