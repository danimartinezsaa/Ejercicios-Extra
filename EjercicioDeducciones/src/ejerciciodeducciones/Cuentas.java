/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeducciones;

/**
 *
 * @author dani
 */
public class Cuentas {
    
    public Cuentas(){
        
    }
    
    public float chijos(int hijos, float sueldo){
        int dinero=0;
        if(hijos==0)
            dinero=180;
        else if(hijos==1)
            dinero=240;
        else if(hijos==2)
            dinero=300;
        else if(hijos>2)
            dinero=360;
        
        sueldo=sueldo+dinero;
        return sueldo;
    }
    
    public int deducciones(int horas){
        int deducciones=360;
        for(int i=0;i<horas;i++){
            deducciones=deducciones-6;
        }
        
        if(deducciones>=0);
        else deducciones=0;
        
        return deducciones;
    }
    
    
}
