package org.yacpait.filewrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileWrite {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("readme.txt");
			fos.write(65);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
