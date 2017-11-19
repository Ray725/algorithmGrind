package data_structures;

import java.io.IOException;

public class ChapterOne {
	
	public static void main(String[] args) {
		String file = "/Users/raymondli/algorithmGrind/data_structures/src/data_structures/temp.txt";
		WriteFile writer = new WriteFile(file, true);
		try {
			System.out.println("Starting!");
			for(int i = 0; i < 100001; i++) {
				writer.writeToFile(Integer.toString(i));
			}
			System.out.println("Success!");
		} catch (IOException err) {
			System.out.println("Failed to write to " + file);
		}
	}
	
}
