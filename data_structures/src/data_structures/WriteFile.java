package data_structures;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
	
	private String path;
	private boolean append_to_file = false;
	
	public WriteFile(String file_path) {
		this.path = file_path;
	}
	
	public WriteFile(String file_path, boolean append) {
		this.path = file_path;
		this.append_to_file = append;
	}
	
	public void writeToFile(String textLine) throws IOException {
		PrintWriter printer = new PrintWriter(new FileWriter(path, append_to_file));
		printer.printf("%s" + "%n", textLine);
		printer.close();
	}
	
}
