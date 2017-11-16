/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoelectricidad;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class ConsumoElectricidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Datos p1=new Datos();
        String codigo=null;
        while(true){
            p1.setCodigo(JOptionPane.showInputDialog("Introduzca código del cliente:"));
            codigo=p1.getCodigo();
            if(codigo.equals("*"))
                break;
            p1.setLectura_1(Integer.parseInt(JOptionPane.showInputDialog("Introduzca lectura anterior en Kw/h:")));
            p1.setLectura_2(Integer.parseInt(JOptionPane.showInputDialog("Introduzca lectura actual en Kw/h:")));
            p1.setPotencia(Float.parseFloat(JOptionPane.showInputDialog("Introduzca potencia contratada:")));
            
            JOptionPane.showMessageDialog(null, "Importe a pagar: "+p1.total());
        }
    }
    
}
