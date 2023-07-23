package commons_IO;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Sort_Lines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       
		File file = new File("G:\\TOOLS\\Apache Commons IO\\Test Document\\File2.txt");
		
		List<String> list = FileUtils.readLines(file,"UTF-8");
		
		Collections.sort(list);
		
		FileUtils.write(file, "", "UTF-8", false);
		
		for(String x : list) {
			FileUtils.write(file, x+"\n", "UTF-8", true);
			System.out.println(x);
		}
	}

}
