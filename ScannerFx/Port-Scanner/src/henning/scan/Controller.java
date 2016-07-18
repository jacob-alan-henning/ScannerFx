package henning.scan;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.*;
import java.net.*;
import java.util.Date;

public class Controller {
@FXML
private TextField start;
@FXML
private Button begin;
@FXML
private CheckBox well,reg;
private InetAddress add;
	public void start() throws UnknownHostException, FileNotFoundException, IOException{
		Date date = new Date();
		LogWriter log = new LogWriter(new File("C:\\log\\scanlog.txt"));
		log.write("scan started on " + date.toString()+"\n");
		try{
		add = InetAddress.getByName(start.getText());
		}catch (NullPointerException ex){
			add = InetAddress.getByName(start.getText());
		}	
		if (well.isSelected()==true && reg.isSelected()==false){
			addThread(0,1024);
		}
		else if (well.isSelected()==false && reg.isSelected()==true){
			addThread(1024,49152);
		}
		else {
			addThread(0,49152);
		}
	}
	public void addThread(int firstPort,int endPort) throws IOException{
		for (int i = firstPort;i<endPort;firstPort++){
			@SuppressWarnings("unused")
			PortThread p1 = new PortThread(firstPort,200,add);
		}
	}
}
