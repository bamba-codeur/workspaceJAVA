package fr_172_12_00;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FR_172_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path p= Paths.get("C:\\Users\\BAMBA\\eclipse-workspace\\data.txt");
		
		System.out.println("toString:"+ p);
		System.out.println("getFileName: "+ p.getFileName());
		System.out.println("getRoot: "+ p.getRoot());
		
		Path p2=Paths.get("C:/User/BAMBA/eclipse-workspace/../data.txt");
		
		System.out.println(p2.normalize());
		
		File f=p.toFile();
		
		System.out.println(f.exists());
		System.out.println(p.toUri());
		
		
		
	}

}
