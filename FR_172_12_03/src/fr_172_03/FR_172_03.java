package fr_172_03;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FR_172_03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Path p=Paths.get("C:\\Users\\BAMBA\\eclipse-workspace\\data.txt.txt");
		
		List<String> lignes=Files.readAllLines(p);
		
		for(String c : lignes) {
			System.out.println("=>" +c);
		}
		
		
		

	}

}
