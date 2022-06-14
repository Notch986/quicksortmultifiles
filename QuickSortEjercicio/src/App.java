import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFileChooser;

import FileReader.CreateFile;
import FileReader.ReadFile;
import Sort.RandomizedQsort;
public class App {
    public static void main(String[] args) {
		
		 JFileChooser chooser = new JFileChooser();
		 
		 chooser.setMultiSelectionEnabled(true);

		 Component frame = null;

		 chooser.showOpenDialog(frame);
		 	File[] files = chooser.getSelectedFiles();
			
		 	ArrayList<String> valores = new ArrayList<String>();

			ReadFile[] archivos = new ReadFile[files.length];
				
			for (int i = 0; i < files.length; i++) {
					archivos[i]= new ReadFile();
					int tmp[]=archivos[i].lee(files[i].toString());
					

					long inicioTemp = System.nanoTime();
					RandomizedQsort.sort(tmp, 0, tmp.length-1);
					long finTemp = System.nanoTime();
					long tTemp=finTemp-inicioTemp;
					
					valores.add("Array Ordenado de "+files[i].toString()+" : "+Arrays.toString(tmp)+" con un tiempo de: "+String.valueOf(tTemp)+"nanosegundos");
								
				     System.out.println(valores.get(i));
		
			}
			
			String pathResultado= "resultado.txt";
			CreateFile.creaDoc(valores,pathResultado);

}
}
