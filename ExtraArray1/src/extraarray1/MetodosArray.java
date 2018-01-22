/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraarray1;

import java.util.Arrays;

/**
 *
 * @author dani
 */
public class MetodosArray{
    private static float media=0;
    
    public void calcularMedia(int array[]){
        for(int i=0;i<array.length;i++){
            media=media+array[i];
        }
        media=media/array.length;
        System.out.println("La media de las altura es: "+media+".");
    }
    
    public void calcularSuperiorMedia(int array[]){
        int superior=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>media)
                superior++;
        }
        System.out.println("Hay "+superior+" que miden más que la media.");
    }
    
    public void calcularPorcentajeInferior(int array[]){
        float inferior=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<media)
                inferior++;
        }
        inferior=(inferior/array.length)*100;
        System.out.println("El porcentaje con altura inferior a la media es: "+inferior+"%.");
    }
    
    public void ordenar(int[] altura){
        int array[]=new int[altura.length];
        for(int i=0;i<array.length;i++){
            array[i]=altura[i];
        }
        
        int j;
        int aux;
        for(int i=0;i<array.length-1;i++){
            for(j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    
}
