/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeducciones;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class EjercicioDeducciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados empleado1=new Empleados();
        Cuentas cuenta=new Cuentas();
        
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        empleado1.setNombre(nombre);
        
        String hijos=JOptionPane.showInputDialog("Ingrese número de hijos:");
        int nhijos=Integer.parseInt(hijos);
        empleado1.setHijos(nhijos);
        
        String horas=JOptionPane.showInputDialog("Ingrese el número de horas de ausentismo:");
        int nhoras=Integer.parseInt(horas);
        empleado1.setHoras(nhoras);
        
        String sueldo=JOptionPane.showInputDialog("Inserte el sueldo fijo:");
        int nsueldo=Integer.parseInt(sueldo);
        empleado1.setSueldo(nsueldo);
        
        JOptionPane.showMessageDialog(null,"GRATIFICACIÓN EXTRA\n"
                + "Nombre: "+empleado1.getNombre()+
                "\nNúmero hijos: "+empleado1.getHijos()+
                "\nHoras ausentismo: "+empleado1.getHoras()+
                "\nSueldo Fijo: "+empleado1.getSueldo()+
                "\nDeducciones: "+cuenta.deducciones(empleado1.getHoras())+
                "\nGratificación total: "+(cuenta.chijos(empleado1.getHijos(), empleado1.getSueldo())+cuenta.deducciones(empleado1.getHoras())));
    }
    
}
