package interfaceDeque;

public class Principal {

	public static void main(String[] args) {
		
		Pile<Integer> maPile= new Pile<>();
		
		maPile.push(5);
		
		int val= maPile.pop();
		System.out.println("Pile: "+val);
		
	}

}
