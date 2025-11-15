package org.yacpait.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args) {
	 FileInputStream f = null;
	 FileOutputStream fos =null;
	 try {
			f = new  FileInputStream("readme.txt");
			fos = new FileOutputStream("copy.txt");
			System.out.println("file found");
		      int data = f.read(); 
		      while(data!= -1) {
		    	 fos.write(data);  
		    	 data = f.read();
		   }  
		}
      
      catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		
		e.printStackTrace();
	}finally {
		try {
			f.close();
			fos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	 
	
	 
}
}