package main;



public class Principal {

	public static void main(String[] args) {
		
		Bibliotheque bib =new Bibliotheque("Bamba Bib");
		
		bib.ajoutDocument("Science","La recherche",43);
		bib.ajoutDocument("phylo","La conscience meme du soi","Damasio");
		
		System.out.println(bib.getInfos());
		
		

	}

}
