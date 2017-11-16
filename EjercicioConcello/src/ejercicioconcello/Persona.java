/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioconcello;

/**
 *
 * @author dani
 */
public class Persona {
    String nombre;
    int ecivil;
    int edad;
    char sexo;
    
    public Persona(){
        
    }
    public Persona(String nombre, int ecivil, int edad, char sexo) {
        this.nombre = nombre;
        this.ecivil = ecivil;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEcivil() {
        return ecivil;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEcivil(int ecivil) {
        this.ecivil = ecivil;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", ecivil=" + ecivil + ", edad=" + edad + ", sexo=" + sexo;
    }
    
    
}
