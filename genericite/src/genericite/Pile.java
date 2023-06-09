package genericite;



public class Pile<Truc> {
	
	
	Truc[] datas;
	int indices;
	

	public Pile(int taille) {
		// TODO Auto-generated constructor stub
		datas=(Truc[])new Document[taille];
		indices=0;
	}

	void push(Truc doc) {
		datas[indices++]=doc;
		
	}
	
	Truc pop() {
		return datas[indices--];
	}

}
