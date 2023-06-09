package fr_179_03_01;

public class Document {
	
	private String titre;
	private String auteur;
	
	private static int nb;
	
	Document(String t,String a){
		titre=t;
		auteur=a;
		nb++;
	}
	
	public String getTitre() {
		return titre;
	}
	public String getAuteur() {
		return auteur;
	}
	
	public static int getCount() {
		return nb;
	}

}
