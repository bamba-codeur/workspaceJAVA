package main;

class Revue extends Document {

	private int nbPages;

	public Revue(String titre, int nbPages) {
		super(titre);
		this.nbPages=nbPages;
	}
	
	@Override
	public String getInfos(){
		return  super.getInfos()+ " : "+nbPages;
		
	}

}
