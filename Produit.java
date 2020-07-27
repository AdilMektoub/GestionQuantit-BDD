package Collection;

public class Produit {

	//dans la classe test je cr�e une Hashmap qui s'appelle STOCK contient cl� = Produit / valeur = quantit�
	//dans la classe test je cr�e 2 m�thode qui permettent d'AUGMENTER ou de DIMINUER la quantit� d'un produit dans le stock
	//dans la classe je cr�e une m�thode qui s'appelle ACHETER qui prend en parametre le produit et la quantit� achet�e

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
