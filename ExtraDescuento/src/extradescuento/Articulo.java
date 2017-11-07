/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extradescuento;

/**
 *
 * @author dani
 */
public class Articulo {
  
    public void descuento(float punidad, int uvendidas){
        float descuento=0.0f,ptotal=0.0f,pdesc=0.0f;
        
        if (uvendidas<100){
           descuento=0.0f;
           ptotal=punidad*uvendidas;
           pdesc=ptotal;
        }
        else if (uvendidas>=100 && uvendidas<200 && punidad>4000){
            descuento=5f;
            ptotal=punidad*uvendidas;
            pdesc=ptotal*(descuento*0.01f);
        }
        else if(uvendidas>=100 && uvendidas<200 && punidad<4000){
            descuento=2f;
            ptotal=punidad*uvendidas;
            pdesc=ptotal*(descuento*0.01f);
        }
        else if(uvendidas>=200 && punidad>4000){
            descuento=10f;
            ptotal=punidad*uvendidas;
            pdesc=ptotal*(descuento*0.01f);
        }
        else if(uvendidas>=200 && punidad<4000){
            descuento=8f;
            ptotal=punidad*uvendidas;
            pdesc=ptotal*(descuento*0.01f);
        }
        
        System.out.println("Precio total sin descuento:"+ptotal+"\nPrecio final:"+pdesc+"\ndescuento:"+descuento);
    }
}
