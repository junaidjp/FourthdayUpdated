package com.inputoutput;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

public class FileHandling {
	public static void main(String[] args) {
		// Create an object that is a directory
		File myDir = new File("/training/jquery");
		System.out.println(myDir.getAbsolutePath()
		+ (myDir.isDirectory() ?" is " : " is not ")
		+ "a directory");
		System.out.println("The parent of " + myDir.getName() + " is "
		+ myDir.getParent());
		// Define a filter for txt source files beginning with f
		FilenameFilter select = new FileListFilter("f", "txt");
		// Get the contents of the directory
		File[] contents = myDir.listFiles(select);
		// List the contents
		if (contents != null) {
			System.out.println("\nThe " + contents.length
					+ " matching items in the directory, "
					+ myDir.getName() + ", are:");
					for (File file : contents) {
					System.out.println(file + " is a "
					+ (file.isDirectory() ? "directory" : "file")
					+ " last modified on\n"
					+ new Date(file.lastModified()));
					}
					} else {
					System.out.println(myDir.getName() + " is not a directory");
					}
					return;
					}
}