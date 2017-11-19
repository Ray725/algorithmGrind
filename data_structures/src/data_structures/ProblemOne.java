package data_structures;

import java.io.*;
import java.util.Stack;

public class ProblemOne {
	
	static void reverse(String fileName) {
		Stack<String> stack = new Stack<String>();
		String line = null;
		
		// populate the stack
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				stack.push(line);
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file: " + fileName);
		} catch (IOException ex) {
			System.out.println("Error reading file: " + fileName);
		}
		
		// pop the stack
		while(true) {
			if(!stack.isEmpty()) {
				System.out.println(stack.pop());
			} else {
				break;
			}
		}
	}
	
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
