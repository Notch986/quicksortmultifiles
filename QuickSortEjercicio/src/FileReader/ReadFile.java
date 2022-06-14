package FileReader;

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

	
	private File archivo;
    private FileReader fr;
    private BufferedReader br;
    private ArrayList<Integer> numsTemp = new ArrayList<>();


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