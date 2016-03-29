import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TestFileUtils {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		File file2 = new File("test_new.txt");
		
		try {
			
//			String input = FileUtils.readFileToString(file);
//			System.out.println(input);
			FileUtils.copyFile(file, file2);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
