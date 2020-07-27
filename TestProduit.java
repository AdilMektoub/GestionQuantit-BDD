package Collection;

import java.util.HashMap;

public class TestProduit {

	public static  HashMap<Produit, Integer> augmenter(HashMap<Produit, Integer> stock, 
			Produit prod, int quantite )
	{
		 Integer j = stock.get(prod); 
         stock.put(prod, (j == null) ? quantite : j + quantite);   
//         System.out.println((condition) ? "valeur si la condition est vrai" : "valeur si contraire");
		return stock;
	}
	public  static HashMap<Produit, Integer> diminuer(HashMap<Produit, Integer> stock, Produit prod, int quantite )
	{
		stock.remove(prod.getNomProduit(), quantite);
		Integer j = stock.get(prod); 
		if(j==null)  System.out.println("produit inexistant");
		else if ( j< quantite) System.out.println("quantite max pour la vente: "+j);
		else 
        stock.put(prod, j - quantite); 
		return stock;
	}

	public static void main(String[] args) {
		
		HashMap<Produit, Integer> stock= new HashMap <Produit, Integer>();
		Produit pr= new Produit("001","Pates");
		stock.put(pr, 20);
		Produit bc = new Produit("002", "Beure de cacahouette");
		System.out.println(stock);
		System.out.println("quantité pates initiale: "+stock.get(bc));
		stock = augmenter(stock, bc,30);
		System.out.println("quantité pates après augmentation :"+stock.get(bc));
		pr.acheter(pr, 10);
		stock = diminuer(stock, bc,10);
		System.out.println("quantité pates après achat et (diminution) :"+stock.get(bc));
	}
}
