import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("test.txt");
		
		BufferedReader  br=null;
		
		try {
			FileReader fr = new FileReader(file);
			
			br = new BufferedReader(fr);
			
			String line ;
			
			while( (line = br.readLine())!=null){
				System.out.println(line);
			};
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found:"+file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read File: "+file.toString());
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Unable to close file: "+file.toString());
			}
			catch (NullPointerException ex) {
				// TODO Auto-generated catch block
				//FIle was probably never opened!
			}
		}
		
		
	}

}
