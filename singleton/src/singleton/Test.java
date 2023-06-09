package singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bibliotheque bib= Bibliotheque.getInstance();
		bib.ajoutDocument("BLEACH", "Toshiyo");
		bib.ajoutDocument("NARUTO", "ISHIDA");
		

	}

}
