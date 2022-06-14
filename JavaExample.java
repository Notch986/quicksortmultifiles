import javax.swing.*;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class JavaExample {
	 public static void main(String[] args) {

	       /* JFileChooser jFileChooser = new JFileChooser();

	        int checkInput = jFileChooser.showOpenDialog(null);

	        if (checkInput == JFileChooser.APPROVE_OPTION) {
	            File openedFile = jFileChooser.getSelectedFile();

	            System.out.println("File Name: " + openedFile.getName());
	            System.out.println("File Location: " + openedFile.getAbsolutePath());
	        }*/
		
		 JFileChooser chooser = new JFileChooser();
		 chooser.setMultiSelectionEnabled(true);

		 Component frame = null;

		 chooser.showOpenDialog(frame);
		 File[] files = chooser.getSelectedFiles();
		 
		 for(int i =0; i<files.length;i++) {
			 System.out.println(files[i]);
			 
		 }
	
}}