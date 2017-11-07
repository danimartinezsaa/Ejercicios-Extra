/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extradescuento;

import java.util.Scanner;

/**
 *
 * @author dani
 */
public class ExtraDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        
        int uvendidas;
        float punidad;
        
        System.out.println("Inserte unidades vendidas:");
        uvendidas=scan.nextInt();
        System.out.println("Inserte precio unidad:");
        punidad=scan.nextFloat();
        Articulo art1=new Articulo();
        art1.descuento(punidad, uvendidas);
        
    }
    
}
