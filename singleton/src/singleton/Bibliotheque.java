package singleton;

public class Bibliotheque {
	
	private static Bibliotheque instance;
	
	
	private Bibliotheque() {}
	
	public static Bibliotheque getInstance() {
		synchronized(Bibliotheque.class) {
			if(instance==null)
				return instance=new Bibliotheque();
		}
		return instance ;
		}
	
	public void ajoutDocument(String titre,String auteur) {
		
	}
	//debarrasser un objet en java
	public static void Dispose() {
		instance=null;
	}

}
