package org.yacpait.fileread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		
        FileInputStream f = null;
         try {
			f = new  FileInputStream("readme.txt");
			System.out.println("file found");
		      int data = f.read(); 
		      while(data!= -1) {
		    	  System.out.print((char)data);
		    	  data = f.read();// point to next character
		      }
		    
		}
         
         catch (FileNotFoundException e) {
			e.printStackTrace();
		}
         catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				f.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
