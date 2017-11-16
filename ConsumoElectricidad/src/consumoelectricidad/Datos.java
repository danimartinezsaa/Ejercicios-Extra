/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoelectricidad;

/**
 *
 * @author dani
 */
public class Datos {
    String codigo;
    int lectura_1,lectura_2;
    float potencia;
    final private float iva=0.12f;
    
    public Datos(){
        
    }
    public Datos(String codigo, int lectura_1, int lectura_2, int potencia) {
        this.codigo = codigo;
        this.lectura_1 = lectura_1;
        this.lectura_2 = lectura_2;
        this.potencia = potencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getLectura_1() {
        return lectura_1;
    }

    public int getLectura_2() {
        return lectura_2;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setLectura_1(int lectura_1) {
        this.lectura_1 = lectura_1;
    }

    public void setLectura_2(int lectura_2) {
        this.lectura_2 = lectura_2;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    
    public float total(){
        float total,importep;
        total=(lectura_1+lectura_2)*13.11f;
        
        if(potencia<3.3f)
            importep=224;
        else if(potencia<4.4f)
            importep=351;
        else if(potencia<5.5f)
            importep=413;
        else if(potencia<6.6f)
            importep=517;
        else
            importep=626;

        return total+((total+importep)*iva);
    }
    
}
