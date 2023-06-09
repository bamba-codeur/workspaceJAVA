package fr_179_11_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2 {

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//lecture d'Une ligne

		InputStreamReader ins= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		String str =br.readLine();
		System.out.println("Str :"+str);
		

	}

}
