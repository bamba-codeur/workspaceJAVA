package fr_179_03_01;

public class fr_179_03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("compte: "+Document.getCount());
		
		Document doc=new Document("la conscience du soi","amsaio");
		
		System.out.println("compte: "+Document.getCount());
		
		Document doc1=new Document("la recherche","Cool");
		
		System.out.println("compte: "+Document.getCount());
		

	}

}
