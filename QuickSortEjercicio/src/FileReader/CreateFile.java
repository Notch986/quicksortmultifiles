package FileReader;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.Desktop;  

/**
 * Clase que proporciona el metodo estatico "creaDoc" para porder
 * guardar informacion en un nuevo o existente fichero
 */
public class CreateFile  
	{  
		
		
		/**
		 * Método que recibe una lista de cadenas como parametro y el nombre de un
		 * archivo a crear, escribe la informacion en el nuevo archivo.
		 * @param file
		 * @param name
		 */
		public static void creaDoc(ArrayList<String> file, String name) {
			File file1 = new File(name); //inicia el objeto
			Desktop desktop = Desktop.getDesktop();  
			
			boolean result;
			
			
			try   
			{  
				result = file1.createNewFile();  //comprueba creacion archivo 
			
				try {
			    	PrintWriter fileout = new PrintWriter(new FileWriter(name));
			    
			    	for (int j=0 ; j< file.size();j++)
			        	fileout.println(file.get(j));
			  
			    	fileout.close();
			    	System.out.println("Exito...");
				} catch (Exception e) {
			    	System.out.println(e);
				}
			
				if(result){  
					System.out.println("file created "+file1.getCanonicalPath());
					desktop.open(file1);  
				}else{  
					System.out.println("File already exist at location: "+file1.getCanonicalPath());
					desktop.open(file1);  
				}  
			}catch (IOException e){  
				e.printStackTrace();
			}         
	
			
		}
		
}  