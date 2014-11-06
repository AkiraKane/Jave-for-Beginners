import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		try(BufferedWriter br= new BufferedWriter(new FileWriter(file))){
			br.write("This is line one\n");
			br.write("This s line two");
			br.newLine();
			br.write("Last Line");
			
		
		} catch (IOException e) {
			System.out.println("Unable to read file "+file.toString());
		}
	}

}
