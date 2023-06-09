import java.util.function.*;

public class Consumer1 {

	public static void main(String[] args) {
		
		
		System.out.println("**********Consumer*******************");
		
		Predicate<Integer> pr=i->(i>-10 && i<10);
		
		System.out.println(pr.test(9));
		

		System.out.println("**********Consumer*******************");
		
		//Implementation de Function
		Function<String, Integer> f = s -> s.length(); 
	
		System.out.println( f .apply( "Je suis heureux maintenant" )); 
		
		
		System.out.println("**********Consumer*******************");
		
		//Implementation de Consumer<T>
		// Consumer consomme des donnees mais ne retourne rien
		Consumer<String> c = s -> System.out.println(s); 
		c .accept( "Je consomme des données mais ne retourne rien" );
		
		//Utilisations de Supplier
		
		System.out.println("**********Supplier*******************");
		Supplier<String> otps = () -> {
		     String otp = "";
		     for (int i = 1; i <= 4; i++) {
		        otp = otp + (int) (Math.random() * 10);
		     }
		   return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		
		System.out.println("**********BiPredicate*******************");
		
		BiPredicate<Integer, Integer> bp=(i,j)->(i+j)%2==0;
		System.out.println(bp.test(4, 2));

	}

}
