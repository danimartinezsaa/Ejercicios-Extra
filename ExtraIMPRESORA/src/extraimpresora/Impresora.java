/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraimpresora;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Impresora{
    LinkedList<Texto> impresion=new LinkedList();
    
    public void enviar(){
        Texto t1=new Texto(JOptionPane.showInputDialog("Inserte el contenido de la impresión:"),Integer.parseInt(JOptionPane.showInputDialog("Inserte número de copias:")));
        impresion.add(t1);
    }
    
    public void imprimir(){
        Texto t1=impresion.poll();
        if(t1==null){
            System.out.println("No hay cola para imprimir.");
        }else{
            int copias=t1.copias;
            for(int i=0;i<copias;i++)
                System.out.println(t1.contenido);
        }
    }
    
    public void verCola(){
        System.out.println(impresion.toString());
    }
}
