package lambda;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Thread t = new Thread(() -> { 
		       for ( int i = 0; i < 10; i++) { 
		           System.out .println ( "Le thread enfant est en cours d'exécution" ); 
		       } 
		       }); 
		       t.start(); 
		       for ( int je = 0; je < 10; je++) { 
		          System. out .println( "Le thread parent est en cours d'exécution" ); 
		       } 
		   } 
	}

