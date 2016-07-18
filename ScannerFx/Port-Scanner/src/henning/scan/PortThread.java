package henning.scan;

import java.net.*;
import java.io.*;

public class PortThread extends Thread {
private int port,time;
private InetAddress ip;
private LogWriter log;
	public PortThread(int p,int time,InetAddress s) throws IOException{
		port = p;
		ip = s;
		log = new LogWriter(new File("C:\\log\\scanlog.txt"));
		run();
	}
	public void run(){
		try{
		Socket s = new Socket();
		s.connect(new InetSocketAddress(ip.getHostAddress(), port), time);
		s.close();
		log.write("port " + port + " is open\n");
		}catch (Exception e1){
			try {
				log.write("port" + port + " isn't open\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
