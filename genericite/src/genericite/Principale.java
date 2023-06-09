package genericite;

public class Principale {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Document doc=new Document("La conscience du soi");
		
		Pile<Document> maPile=new Pile<Document>(5);
		maPile.push(doc);
		
		Document d= maPile.pop();
		
		Pile<Integer> maPile2=new Pile<Integer>(10);
		maPile2.push(new Integer(2));
		Integer i=maPile2.pop();
		
	}

}
