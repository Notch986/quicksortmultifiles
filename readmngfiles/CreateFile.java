package readmngfiles;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.Desktop;  

public class CreateFile  
	{  
		public static void expulsasort(int ordenado[], long tiempo) {
			File file = new File("resultado.txt"); //inicia el objeto  
			boolean result;
			int tsize=ordenado.length;
			try   
			{  
			result = file.createNewFile();  //comprueba creacion archivo 
			
			try {
			    PrintWriter fileout = new PrintWriter(new FileWriter("resultado.txt"));
			
			    for (int j=0 ; j<tsize;j++) {
			    	int tmp=ordenado[j];
			    	
			        fileout.println(tmp);
			    }
			    //fileout.print("Tiempo de demora del archivo "+k+":"+"\t"+tiempo+" nanosegundos\n");
			    fileout.print("Tiempo de demora del archivo "+"\t"+tiempo+" nanosegundos\n");
			    fileout.close();
			    System.out.println("success...");
			} catch (Exception e) {
			    System.out.println(e);
			}
			
			if(result)      // test if successfully created a new file  
			{  
			System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
			}  
			else  
			{  
			System.out.println("File already exist at location: "+file.getCanonicalPath());  
			}  
			}   
			catch (IOException e)   
			{  
			e.printStackTrace();    //prints exception if any  
			}         
	
			
		}
		
		public static void creaDoc(ArrayList file, String name) {
			File file1 = new File(name); //inicia el objeto
			Desktop desktop = Desktop.getDesktop();  
			
			boolean result;
			
			
			try   
			{  
			result = file1.createNewFile();  //comprueba creacion archivo 
			
			try {
			    PrintWriter fileout = new PrintWriter(new FileWriter(name));
			    
			    
			
			    for (int j=0 ; j< file.size();j++) {
			    
			    	
			        fileout.println(file.get(j));
			    }
			    //fileout.print("Tiempo de demora del archivo "+k+":"+"\t"+tiempo+" nanosegundos\n");
			  
			    fileout.close();
			    System.out.println("success...");
			} catch (Exception e) {
			    System.out.println(e);
			}
			
			if(result)      // test if successfully created a new file  
			{  
			System.out.println("file created "+file1.getCanonicalPath()); //returns the path string
			desktop.open(file1);  
			}  
			else  
			{  
			System.out.println("File already exist at location: "+file1.getCanonicalPath());
			desktop.open(file1);  
			}  
			}   
			catch (IOException e)   
			{  
			e.printStackTrace();    //prints exception if any  
			}         
	
			
		}
		
		public static void main(String[] args){     
			/*File file = new File("resultado.txt"); //initialize File object and passing path as argument  
			boolean result;  
			try   
			{  
			result = file.createNewFile();  //creates a new file 
			
			try {
			    PrintWriter fileout = new PrintWriter(new FileWriter("resultado_.txt"));
			
			    for (int i = 1; i < 1001; i++) {
			        fileout.println(i);
			    }
			    fileout.close();
			    System.out.println("success...");
			} catch (Exception e) {
			    System.out.println(e);
			}
			
			if(result)      // test if successfully created a new file  
			{  
			System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
			}  
			else  
			{  
			System.out.println("File already exist at location: "+file.getCanonicalPath());  
			}  
			}   
			catch (IOException e)   
			{  
			e.printStackTrace();    //prints exception if any  
			} */
			
			//int arr[] = {10, 7, 8, 9, 1, 6,5,33};
			//expulsa(arr);
			}  
}  