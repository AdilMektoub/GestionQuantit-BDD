package Collection;

public class Produit {

	//dans la classe test je crée une Hashmap qui s'appelle STOCK contient clé = Produit / valeur = quantité
	//dans la classe test je crée 2 méthode qui permettent d'AUGMENTER ou de DIMINUER la quantité d'un produit dans le stock
	//dans la classe je crée une méthode qui s'appelle ACHETER qui prend en parametre le produit et la quantité achetée

//	private int id;
//	private String nom;
	private String id;
	private String nomProduit;
	
	public Produit(String id, String nomProduit) {
		this.id = id;
		this.nomProduit = nomProduit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public void acheter(Produit p, int quantite)
	{
		System.out.println("je vais acheter "+quantite+" "+p.getNomProduit());
	}
}
