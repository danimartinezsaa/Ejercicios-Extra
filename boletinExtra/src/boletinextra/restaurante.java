/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletinextra;

/**
 *
 * @author dani
 */
public class restaurante {
    public int polbo,patacas;
    public restaurante(){
    }
    public restaurante(int polbo, int patacas){
        this.patacas=patacas;
        this.polbo=polbo;
    }
    
    public void engadirPolbo(int polbo){
        this.polbo+=polbo;
    }
    public void engadirPatacas(int patacas){
        this.patacas+=patacas;
    }
    public void amosarPatacas(){
        System.out.println("Hai "+patacas+"kilos de patacas");
    }
    public void amosarPolbo(){
        System.out.println("Hai "+polbo+"kilos de polbo");
    } 
    
    public void clientes(){
        int cpolbo=(int) (polbo*1.5f);
        int cpatacas=patacas*3;
        if(cpolbo>=cpatacas){
            System.out.println("Pódense atender "+ cpatacas+" clientes");
        }
        else{
            System.out.println("Pódense atender "+ cpolbo+" clientes");
        }
    }
    
}
