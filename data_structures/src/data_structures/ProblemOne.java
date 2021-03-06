package data_structures;

import java.io.*;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class ProblemOne {
	
	static void printUnique(String fileName) {
		Set<String> uniqueWord = new HashSet<String>();
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				if(uniqueWord.add(line)) {
					System.out.println(line);
				}
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file: " + fileName);
		} catch (IOException ex) {
			System.out.println("Error reading file: " + fileName);
		}
	}
	
	static void lastFourtyTwo(String fileName) {
		Deque<String> deque = new LinkedList<>();
		// populate the deque
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null) {
				if(line.length() == 0) {
					System.out.println(deque.getFirst());
				} else {
					if(deque.size() > 41) {
						deque.removeFirst();
					}
				}
				deque.addLast(line);
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file: " + fileName);
		} catch (IOException ex) {
			System.out.println("Error reading file: " + fileName);
		}
	}
	
	static void popStack(Stack<String> stack) {
		while(true) {
			if(!stack.isEmpty()) {
				System.out.println(stack.pop());
			} else {
				break;
			}
		}
	}

	static void reverseByFifty(String fileName) {
		Stack<String> stack = new Stack<String>();
		String line = null;
		
		// populate the stack
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				if(stack.size() < 50) {
					stack.push(line);
				} else {
					popStack(stack);
					stack.push(line);
				}
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file: " + fileName);
		} catch (IOException ex) {
			System.out.println("Error reading file: " + fileName);
		}
	}
	
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
		popStack(stack);
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
