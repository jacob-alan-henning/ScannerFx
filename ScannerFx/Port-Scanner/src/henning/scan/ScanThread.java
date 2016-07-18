package henning.scan;

import java.io.*;
import java.net.*;

public class ScanThread extends Thread {
private int time;

private InetAddress ip;
public ScanThread(int t,InetAddress s) throws IOException{
	time = t;
	ip = s;
	
}
	public void run(){
		for (int port = 0;port<1023;port++){
			try {
				PortThread p1 = new PortThread(port,time,ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
