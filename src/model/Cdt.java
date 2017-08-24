
package model;

public class Cdt {
    private  Cliente cliente;
    private float monto;

    public Cdt(Cliente cliente, float monto) {
        this.cliente = cliente;
        this.monto = monto;
    }
    

    public float getMonto() {
        return monto;
    }
    
    
}
