
package model;

public class Cuenta {
    private Cliente cliente;
    private float monto;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public void agregarDinero(float p){
        this.monto+=p;
        System.out.println("Su cuenta tiene "+this.monto+" pesos");
    }
    
    public void retirarDinero(float p){
        if(this.monto>=p){
            this.monto-=p;
        }
        System.out.println("Su cuenta tiene "+this.monto+" pesos");
    }

    public float getMonto() {
        return monto;
    }

    
}
