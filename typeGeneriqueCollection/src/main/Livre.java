package main;

class Livre extends Document {
	
	private String auteur;

	public Livre(String titre, String auteur) {
		super(titre);
		this.auteur=auteur;
	}

}
