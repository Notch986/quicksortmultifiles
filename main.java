import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import javax.swing.JFileChooser;

import quicksort.RandomizedQsort;
import readmngfiles.CreateFile;
import readmngfiles.ReadFile;


public class main {

	public static void main(String[] args) {
		
		Scanner ga = new Scanner(System.in);
		System.out.
		
		 JFileChooser chooser = new JFileChooser();
		 
		 chooser.setMultiSelectionEnabled(true);

		 Component frame = null;

		 chooser.showOpenDialog(frame);
		 	File[] files = chooser.getSelectedFiles();
			
		 	ArrayList<String> valores = new ArrayList<String>();
			ReadFile[] archivos = new ReadFile[files.length];
				
			for (int i = 0; i < files.length; i++) {
					archivos[i]= new ReadFile();
					int tmp[]=archivos[i].lee(files[i].toString(), 12);
					
					long inicioTemp = System.nanoTime();
					RandomizedQsort.sort(tmp, 0, tmp.length-1);
					long finTemp = System.nanoTime();
					long tTemp=finTemp-inicioTemp;
					
					valores.add("Array Ordenado de "+files[i].toString()+" : "+Arrays.toString(tmp)+"con un tiempo de: "+String.valueOf(tTemp)+"nanosegundos");
								
				   // System.out.println("Array Ordenado");
				     //RandomizedQsort.printArray(tmp);
				     System.out.println(valores.get(i));
		
			}
			
			String x= "layka.txt";
			CreateFile.creaDoc(valores,x);

}}
