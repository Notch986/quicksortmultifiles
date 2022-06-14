import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFileChooser;

import FileReader.CreateFile;

import FileReader.ReadFile;
import Sort.QuickSort;
public class App {
    public static void main(String[] args) {
		
		 JFileChooser chooser = new JFileChooser();
		 
		 chooser.setMultiSelectionEnabled(true);

		 Component frame = null;

		 chooser.showOpenDialog(frame);
		 	File[] files = chooser.getSelectedFiles();
			
		 	ArrayList<String> valores = new ArrayList<String>();
			//Creamos el arreglo donde guardaremos los números de los archivos txt

			ReadFile[] archivos = new ReadFile[files.length];

			//Iniciamos un bucle con el número de archivos seleccionados y trabajamos con el arreglo creado
			//que contiene los números de cada archivo txt	
			for (int i = 0; i < files.length; i++) {
					archivos[i]= new ReadFile();
					int tmp[]=archivos[i].lee(files[i].toString());
					

					//Usámos el método para medir el tiempo de inicio y final para hallar el tiempo de ejecución
					long inicioTemp = System.nanoTime();      
					QuickSort.sort(tmp, 0, tmp.length-1);
					long finTemp = System.nanoTime();
					long tTemp=finTemp-inicioTemp;
					
					//Digitamos los números ordenados, la dirección y el tiempo de ejecución en el archivo txt 
					valores.add("Array Ordenado de "+files[i].toString()+" : "+Arrays.toString(tmp)+" con un tiempo de: "+String.valueOf(tTemp)+"nanosegundos");
								
					
				     System.out.println(valores.get(i));
		
			}
			
			String pathResultado= "resultado.txt";   //nombramos el archivo final "resultado.txt"
			CreateFile.creaDoc(valores,pathResultado);

    }
}