package Files;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\file1\\hi.txt");
		System.out.println("File Reading");
		int x = 0;
		while ((x = fis.read()) != -1) {
			System.out.print((char) x);
		}
		System.out.println("\nFile Read Over");
	}

}
