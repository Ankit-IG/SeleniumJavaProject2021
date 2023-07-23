package commons_IO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class text_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * Working with Text Files using Apache Commons IO
		 * 
		 * 1. Download Apache Commons IO from:
		 * https://commons.apache.org/proper/commons-io/download_io.cgi 2. Add Commons
		 * IO jar files to Java Build Path 3. Use FileUtils from commons-io to read a
		 * text file
		 */
		
		File file = new File("G:\\TOOLS\\Apache Commons IO\\Test Document\\File1.txt");
		
		//For read
		//String x = FileUtils.readFileToString(file, "UTF-8");
	
		//System.out.println(x);
		
		//For write
		FileUtils.write(file, "Learning is growing", "UTF-8", true);
	}

}
