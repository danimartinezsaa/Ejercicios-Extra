/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraimpresora;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class ExtraIMPRESORA{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        boolean encendido=true;
        Impresora impresora=new Impresora();
        while(encendido==true){
            int opcion=Integer.parseInt(JOptionPane.showInputDialog("MENÚ:\n"
            + "1 - Enviar contenido.\n"
            + "2 - Imprimir.\n"
            + "3 - Ver cola de impresión.\n"
            + "4 - Salir."));
            
            switch(opcion){
                case 1:
                    impresora.enviar();
                    break;
                case 2:
                    impresora.imprimir();
                    break;
                case 3:
                    impresora.verCola();
                    break;
                case 4:
                    encendido=false;
                    System.exit(0);
                    break;
            }
            
        }
    }
    
}
