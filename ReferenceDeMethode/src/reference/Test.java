package reference;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne[] leTableau =new Personne[2];
		
		leTableau[0]=new Personne("Bamba",24);
		leTableau[1]=new Personne("khadim",25);
		
		System.out.println(leTableau[0]);
		System.out.println(leTableau[1]);
		
		//reference de methode
		Arrays.sort(leTableau,Personne::compareA);
		
		System.out.println(leTableau[0]);
		System.out.println(leTableau[1]);
		

	}

}
