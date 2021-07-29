package a;

import java.io.File;
import java.io.IOException;

public class WhatIsFile {

	public static void main(String[] args) {

		try {
			// create File objects
			// File object points to a file or directory in the file system
			File directory = new File("c:/eldar");
			File file = new File("c:/eldar/letter.txt");
			// check if they exist in the FS
			System.out.println(directory.exists());
			System.out.println(file.exists());
			// create the files
			directory.mkdirs();
			file.createNewFile();
			// check if they exist in the FS
			System.out.println(directory.exists());
			System.out.println(file.exists());
			System.out.println("=========================");
			// check if file or directory
			System.out.println(directory);
			System.out.println("is directory? " + directory.isDirectory());
			System.out.println("is file? " + directory.isFile());
			System.out.println(file);
			System.out.println("is directory? " + file.isDirectory());
			System.out.println("is file? " + file.isFile());
			// delete the files
			System.out.println("=========================");
			System.out.println(file.delete());
			System.out.println(directory.delete());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
