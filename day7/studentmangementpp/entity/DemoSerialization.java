package org.ycpait.studentmangementpp.entity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("student.txt");
			oos = new ObjectOutputStream(fos);
			Student s = new Student("anjali",88);
			oos.writeObject(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
