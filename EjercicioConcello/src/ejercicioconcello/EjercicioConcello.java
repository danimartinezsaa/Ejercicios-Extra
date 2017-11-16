/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioconcello;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class EjercicioConcello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona[]=new Persona[7];
        
        persona[0]=new Persona("Dani",1,22,'V');
        persona[1]=new Persona("Pablo",1,23,'V');
        persona[2]=new Persona("Ana",2,19,'F');
        persona[3]=new Persona("Marisa",3,44,'F');
        persona[4]=new Persona("Sandro",4,29,'V');
        persona[5]=new Persona("Antonio",5,87,'V');
        persona[6]=new Persona("Carmen",2,34,'F');
        
        float media_sol=0,edad=0,separados=0,viudos=0,viudas=0,edadv=200;
        String nombrev=null;
        
        for(byte i=0;i<persona.length;i++){
            if(persona[i].getEcivil()==1){
                edad=edad+persona[i].getEdad();
                media_sol++;
            }
            if(persona[i].getEcivil()==3 || persona[i].getEcivil()==4){
                separados++;
            }
            if(persona[i].getEcivil()==5 && persona[i].getSexo()=='V'){
                viudos++;
                if(persona[i].getEdad()<edadv)
                    edadv=persona[i].getEdad();
                    nombrev=persona[i].getNombre();
                    
            }
            if(persona[i].getEcivil()==5 && persona[i].getSexo()=='F'){
                viudas++;
                if(persona[i].getEdad()<edadv)
                    edadv=persona[i].getEdad();
                    nombrev=persona[i].getNombre();
            }
        }
        
        JOptionPane.showMessageDialog(null,"Media de edad de solteros: "+(edad/media_sol));
        JOptionPane.showMessageDialog(null,"Porcentaje de separados y divorciados: "+(separados/persona.length)*100+"%");
        JOptionPane.showMessageDialog(null,"Porcentaje hombres viúdos: "+(viudos/persona.length)*100+"%");
        JOptionPane.showMessageDialog(null,"Porcentaje mujeres viúdas: "+(viudas/persona.length)*100+"%");
        JOptionPane.showMessageDialog(null,"Nombre viúdo o viúda más joven: "+nombrev+", edad: "+edadv);
    }
    
}
