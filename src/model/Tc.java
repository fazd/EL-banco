/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author fabioandres
 */
public class Tc {
    private Cliente cliente;
    private float cupo;
    private float cupomax;

    public Tc(Cliente cliente,float cupo) {
        this.cliente = cliente;
        this.cupo=cupomax;
        this.cupomax=cupo;
    }
    
    public void UsarTC(float k){
        if(k>cupo){
            System.out.println("No tiene cupo suficiente");
        }
        else{
            cupo=cupo-k;
        }
    }

    public float getCupo() {
        return cupo;
    }

    public float getCupomax() {
        return cupomax;
    }
    
    
}
