
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		declencheExecution(()->System.out.println("Execution !"));
		
		
		MonInterface maFonction = ()->System.out.println("Execution retarde !");
		maFonction.execute();
		
		Maclasse object =new Maclasse();
		
		maFonction=object::execute;
		
		maFonction.execute();
		

	}
	
	public static void declencheExecution(MonInterface mi) {
		mi.execute();
	}

}
