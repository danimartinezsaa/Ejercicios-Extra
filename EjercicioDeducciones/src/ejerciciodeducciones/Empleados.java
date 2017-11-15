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
public class Empleados {
    String nombre;
    int hijos, horas;
    float sueldo;
    
    public Empleados(){
        
    }
    
    public Empleados(String nombre, int hijos, int horas, float sueldo){
        this.nombre=nombre;
        this.hijos=hijos;
        this.horas=horas;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHijos() {
        return hijos;
    }

    public int getHoras() {
        return horas;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
