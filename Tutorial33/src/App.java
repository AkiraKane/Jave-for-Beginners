import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		String fileName  = "C:/Users/Xianda/Desktop/read.txt";
		String fileName  = "read.txt";
		
		File textFile =new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		System.out.println("Read value: "+value);
		
		in.nextLine();// read the nextline marker(\n)
		
		int count= 2;
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(count+": "+line);
			count++;
		}
		
		in.close();
	}

}
