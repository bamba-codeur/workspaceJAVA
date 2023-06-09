package fr_172_09_02;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {
		
		String StringText="Lorem Ipsum dolor sit amet,";
		
		StringTokenizer strTok=new StringTokenizer(StringText);
		//System.out.println("Nombre de mot: "+strTok.countTokens());
		
		while(strTok.hasMoreTokens()) {
			String mot= strTok.nextToken();
			System.out.println(mot);
		}
		//tableau de caracteres
		char[] lesCaracteres= StringText.toLowerCase().toCharArray();
	
		
		Map<Character,Integer> lettres=new HashMap<>();
		
		for( char c : lesCaracteres) {
			Integer v=lettres.get(c);
			if(v==null) {
				v=1;
			}else {
				v++;
			}
			lettres.put(c,v);
			
		}
		
		for(char c: lettres.keySet()) {
			System.out.println("char :"+c+" ->"+lettres.get(c));
		}
	
		
		
		

	}

}
