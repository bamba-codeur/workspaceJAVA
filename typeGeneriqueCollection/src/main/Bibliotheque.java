package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bibliotheque {
	
	private String titre;
	
	private List<Document> mesDocs;
	private Map<String,Document> mesIndex;
	
	Bibliotheque(String titre){
		this.titre=titre;
		mesDocs= new ArrayList<>();
		mesIndex= new HashMap<>();
	}

	public void ajoutDocument(String index, String titre, int nbPages) {
	Revue r=new Revue(titre,nbPages);
	mesDocs.add(r);
	mesIndex.put(index, r);
	
		
	}

	public void ajoutDocument(String index, String titre, String auteur) {
		Livre l=new Livre(titre,auteur);
		mesDocs.add(l);
		mesIndex.put(index, l);
		
	}
	
	public String getInfos() {
		String retval="Bibliotheque"+" : "+titre+"\n";
		for(Document doc : mesDocs) {
			retval+= doc.getInfos()+ "\n";
			
		}
		return retval;
		
		
	}

	public Collection<String> getIndexes() {
		return mesIndex.keySet();
	}
	
	
	
	
	

}
