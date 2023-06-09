package lambda;

interface MonInterface{
	void print(String s);
	
}

public class Lambda {
	
	public static void affiche(MonInterface printer) {
		printer.print("Coucou");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		affiche( x-> System.out.println(x));
		

	}

}
