package Files;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {

	

		FileOutputStream fos = new
		FileOutputStream("C:\\file1\\hi.txt");
		String s = "This is an output message.";
		for(int i=0;i<s.length();i++)
		fos.write(s.charAt(i));
		System.out.println("File Written");
		fos.close();
		 }
		

	

}
