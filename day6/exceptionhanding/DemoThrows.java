package org.ycpait.exceptionhanding;

import java.io.IOException;

public class DemoThrows {
	public static void main(String[] args) {
//		IOException e = new IOException();
//		
//		throw e;
		//handling exception
//		try {
//			throw e;
//		}
//		catch(IOException ex) {
//			
//		}
//	
		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	 static void readFile() throws IOException {
		 IOException e = new IOException();
		 throw e;
	 }
}
