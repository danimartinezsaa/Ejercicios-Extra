/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraimpresora;

/**
 *
 * @author dani
 */
public class Texto{
    String contenido;
    int copias;

    public Texto(){
    }

    public Texto(String contenido, int copias){
        this.contenido=contenido;
        this.copias=copias;
    }

    public String getContenido(){
        return contenido;
    }

    public void setContenido(String contenido){
        this.contenido=contenido;
    }

    public int getCopias(){
        return copias;
    }

    public void setCopias(int copias){
        this.copias=copias;
    }

    @Override
    public String toString(){
        return "contenido: "+contenido+", copias: "+copias;
    }
    
    
}
