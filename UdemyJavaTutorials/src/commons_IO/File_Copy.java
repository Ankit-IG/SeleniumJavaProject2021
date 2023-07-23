package commons_IO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class File_Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * Copy content of one file to another
		 * Copy a file to directory
		 * Rename/Move a file
		 */
		File file1 = new File("G:\\TOOLS\\Apache Commons IO\\Test Document\\File1.txt");
		File file3 = new File("G:\\TOOLS\\Apache Commons IO\\Test Document\\File3.txt");
		File Dir = new File("G:\\TOOLS\\Apache Commons IO\\Test Document\\Dir");
		File file4 = new File("G:\\TOOLS\\Apache Commons IO\\Test Document\\File4.txt");
		
		FileUtils.copyFile(file1, file3);
		FileUtils.copyFileToDirectory(file1, Dir);
		FileUtils.moveFile(file1, file4);
	}

}
