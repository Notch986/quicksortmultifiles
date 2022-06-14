package FileReader;

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que permite manejar archivos de lectura. Tiene como actor principal
 * al metodo "leer" que hace uso del metodo privado abrir archivo.
 */
public class ReadFile {

	
	private File archivo;
    private FileReader fr;
    private BufferedReader br;
    private ArrayList<Integer> numsTemp = new ArrayList<>();


	/**
	 * Método privado que abre el archivo con el nombre ingresado como 
	 * parametro, crea los buffers correspondientes. Retorna verdadero si no hubo 
	 * problemas al abrir el archivo, de lo contrario es falso.
	 * @param path
	 * @return
	 */
    private boolean abrirArchivo(String path){
        try{
            archivo = new File(path);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        }catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
            return false;
        }
        return true;
    }
		
	/**
	 * Método que recibe como parametro un path de un fichero, lee cada linea
	 * y almacena la informacion en un arreglo.
	 * @param path
	 * @return
	 */
	public  int[] lee (String path) {
		String line;
		int [] numeros;
		if(abrirArchivo(path)){
                
			try {
				while ((line = br.readLine())!= null) {
					int t = Integer.parseInt(line);
					numsTemp.add(t);
				}
			} catch (IOException e) {
				System.out.println("Error: "+e.getMessage());
			} catch (NumberFormatException e){
				System.out.println("Error: "+e.getMessage());
			}finally{
				try {
					if (br != null)
						br.close();
					if (fr != null)
						fr.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}

		}

		numeros = new int[numsTemp.size()];
        for (int i = 0; i < numsTemp.size(); i++) {
            numeros[i] = numsTemp.get(i);
        }

        numsTemp.clear();

		
		return numeros;
		
	}

}