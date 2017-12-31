import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class processor {
	public static void main(String[] args){
		try {
			String newline = System.getProperty("line.separator");
			File dir1 = new File(args[0]);
			if (!dir1.exists()){
				System.err.println("No File");
			}
			Scanner sc = new Scanner(dir1);
			String lineread = null;
			while (sc.hasNextLine()) {
				lineread = sc.nextLine();
				System.out.print(lineread+newline);
			}
			
		} catch (IOException e) {
			System.out.print("couldnt init file");
		}
	}

}
