/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletinextra;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class BoletinExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        restaurante rest= new restaurante(11,3);
        rest.clientes();
        JOptionPane.showMessageDialog(null, "Hola mundo!!!");
    }
    
}
