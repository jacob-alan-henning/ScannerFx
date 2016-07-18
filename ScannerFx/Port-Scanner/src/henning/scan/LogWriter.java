package henning.scan;

import java.io.*;

public class LogWriter {
private File file;
private FileWriter fw;
	public LogWriter(File f) throws IOException{
		file = f;
		if (!file.exists()) {
		     file.createNewFile();
		  }
	}
	public void write(String w) throws IOException{
		fw = new FileWriter(file,true);
		fw.write(w);
		fw.close();
		
	}
	public void close() {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
