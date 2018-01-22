/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraarray1;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class ExtraArray1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MetodosArray m=new MetodosArray();
        int altura[]=new int[10];
        for(int i=0;i<altura.length;i++){
            altura[i]=Integer.parseInt(JOptionPane.showInputDialog("Inserte altura "+(i+1)));
        }
        
       m.calcularMedia(altura);
       m.calcularSuperiorMedia(altura);
       m.calcularPorcentajeInferior(altura);
       m.ordenar(altura);
    }
    
}
