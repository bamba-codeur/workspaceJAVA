package fr_172_03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FR_172_03 {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("text.txt");
		PrintWriter pw=new PrintWriter(fw);
		
		pw.print(3.14);
		pw.close();
		
		FileOutputStream fos=new FileOutputStream("data.dat");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeDouble(3.14);
		dos.close();
		
		

	}

}
