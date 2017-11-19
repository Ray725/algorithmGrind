package data_structures;

import java.io.*;

public class ProblemOne {
	
	static void readFile(String fileName) {
		String line = null;
		
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file: " + fileName);
		} catch (IOException ex) {
			System.out.println("Error reading file: " + fileName);
		}
	}
	
}
