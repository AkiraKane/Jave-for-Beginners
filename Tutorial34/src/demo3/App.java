package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// PS. this message is too vague
			System.out.println("Could not open file");
		}
			
		
	}
	
	public static void openFile() throws FileNotFoundException{
		File file = new File("test.txtd");

		FileReader fr = new FileReader(file);
	}

}
