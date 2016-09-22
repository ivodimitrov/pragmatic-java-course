package com.pragmatic.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Task8 {
	public static void main(String[] args) {
		File sourceFile = new File("/Users/milenpenchev/dev/test/source.txt");
		File targetFile = new File("/Users/milenpenchev/dev/test/target.txt");
		
		String neshto = JOptionPane.showInputDialog("Tell me something");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
			StringBuilder builder = new StringBuilder();
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(System.lineSeparator());
			}
			
			reader.close();
			
			String text = builder.reverse().toString();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile));
			writer.write(text);
			writer.flush();
			writer.close();
			
//			PrintWriter printWriter = new PrintWriter(targetFile);
//			printWriter.println(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
