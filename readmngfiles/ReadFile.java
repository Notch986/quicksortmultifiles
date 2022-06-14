package readmngfiles;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
	static int tsize;
	
	
		
	public  int[] lee (String archivo, int ancho) {
		
		
		int cont=0;
		int []datos=new int[ancho];
		tsize=ancho;
		 try {
		      File myObj = new File(archivo);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextInt()) {
		    	datos[cont]=myReader.nextInt();
		        
		        //System.out.println(datos[cont]);
		        cont++;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Error");
		      e.printStackTrace();
		    }
		return datos;
		
	}
	
	
	
	  public static int getTsize() {
		return tsize;
	}





	public static void main(String[] args) {
		  
		 /* String x= "filename.txt";
		  lee(x,10);
		  int y[]= lee(x,10);
		  System.out.println(y.length);*/
	  }
}