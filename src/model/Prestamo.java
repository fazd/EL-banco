
package model;

public class Prestamo {
    private Cliente cliente;
    private float cantidad;
    private float cantidadT;

    public Prestamo(Cliente cliente, float cantidad) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.cantidadT= cantidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getCantidadT() {
        return cantidadT;
    }
   
    public void agregarDinero(float k){
        if(this.cantidad>=k){
            this.cantidad-=k;
            System.out.println("solo debe ahora "+this.cantidad+" pesos");
        }
        else{
            System.out.println("Usted no debe tanto");
        }
    }
}
