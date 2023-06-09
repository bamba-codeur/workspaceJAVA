package reference;

public class Personne {
	
	private String nom;
	private int age;
	
	Personne(String nom,int age){
		
		this.nom=nom;
		this.age=age;
	}
	
	public static int compareA(Personne p1,Personne p2) {
		return p1.age-p2.age;
	}
	
	@Override
	public String toString(){
		return nom+": "+age; 
		
	}

}
