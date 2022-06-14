package Sort;

/**
 * Clase que proporciona el metodo estatico "sort" para ordenar arreglos de enteros
 * usando el algoritmo de QickSort
 */
public class QuickSort {
	

    /**
     * Metodo que recibe como parametros una arreglo de enteros 
     * e indices para ejecutar el algoritmo.
     * @param numeros
     * @param izq
     * @param der
     */
	public static void sort(int[] numeros, int izq, int der){
        int pivote=numeros[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
        
        while(i < j){                          // mientras no se crucen las búsquedas                                   
            while(numeros[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(numeros[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado                      
                aux= numeros[i];                      // los intercambia
                numeros[i]=numeros[j];
                numeros[j]=aux;
            }
        }
        
        numeros[izq]=numeros[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        numeros[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
        
        if(izq < j-1)
            sort(numeros,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            sort(numeros,j+1,der);
    }
  	
}


