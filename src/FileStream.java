import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStream {
	public FileStream() {
		// TODO Auto-generated constructor stub

	}

	public void read() {
		try {
			File file = new File("test.txt");
			FileReader fileReader = new FileReader(file);
			int ch = fileReader.read();

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
