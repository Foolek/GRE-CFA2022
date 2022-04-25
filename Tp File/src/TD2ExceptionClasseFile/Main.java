package TD2ExceptionClasseFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
	public static void main(String[] args) throws IOException {
		File dico = new File("Dictionnaire.txt");

		dico.createNewFile();
		readFile(dico);


	}

	public static void readFile(File file) throws IOException {
		RandomAccessFile input = null;
		String line = null;
		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}
}
