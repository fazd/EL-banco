
package model;

import java.util.ArrayList;
import java.util.Scanner;


public class Cliente {
    private String nombre;
    private long telefono;
    private Sucursal sucursal;
    private Cdt CDT;
    private ArrayList <Tc> tc;
    private Prestamo prestamo;
    private Cuenta cuenta;
    private Ejecutivo ejecutivo;
    private EjecutivoVIP ejecutivoVIP;
    private int cedula;
    private int indexTC;
    private float total;
    private int productos;
    
    Scanner scan= new Scanner(System.in);
    
    public Cliente(String nombre,int cedula, long tel,Sucursal a){
        this.sucursal = a;
        this.tc=new ArrayList();
        a.addCliente(this);
        this.cedula=cedula;
        this.cuenta= new Cuenta(this);
        this.nombre=nombre;
        this.telefono=tel;
        this.indexTC=0;
        this.total=0;
        this.CDT=null;
        this.prestamo=null;
        this.prestamo=null;
        this.productos=1;
        this.ejecutivoVIP=null;
        
    }

    public void setEjecutivo(Ejecutivo ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public int getProductos() {
        return productos;
    }
    
    public void crearCDT(float k){
        CDT=new Cdt(this,k);
        System.out.println("Su cantidad ha sido asegurada");
        productos++;
        cambiarEjecutivo();
    }
    public void crearPrestamo(float k){
        prestamo = new Prestamo(this,k);
        productos++;
        cambiarEjecutivo();
        
    }
    public void crearTC(){
        tc.add(new Tc(this,1000000));
        indexTC++;
        System.out.println("Su tarjeta ha sido activada");
        productos++;
    }

    public int getIndexTC() {
        return indexTC;
    }

    public void agregarDinero(float k){
        cuenta.agregarDinero(k);
        System.out.println("Su dinero ha sido agregado");     
        cambiarEjecutivo();
    }

    public float getTotal() {
        if(CDT!=null){
            total=total+CDT.getMonto();
        }
        
        for(Tc tc : tc){
            total=total+tc.getCupomax();
        }
        
        if(prestamo!=null){
            total=total+prestamo.getCantidadT();
        }
        if(cuenta!=null){
            total=total+cuenta.getMonto();
        }
        return total;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public float getCuenta(){
        return cuenta.getMonto();
    }
    
    public float getPrestamo(){
        return prestamo.getCantidad();
    }

    public float getCDT(){
        if(CDT!=null)
        return CDT.getMonto();
        else{
            return 0;
        }
    }
    
    public int getCedula() {
        return cedula;
    }
    
    private void cambiarEjecutivo(){
        float k=getTotal();
        if(k>=100000000 && ejecutivoVIP==null){
            ejecutivo.eliminarCliente(this);
            ejecutivo=null;
            ejecutivoVIP=sucursal.obtenerEjecutivoVIP();
            ejecutivoVIP.agregarCliente(this);
        }
        else if (k<100000000 && ejecutivoVIP!=null){
            ejecutivoVIP.eliminarCliente(this);
            ejecutivoVIP=null;
            ejecutivo=sucursal.obtenerEjecutivo();
            ejecutivo.agregarCliente(this);   
        }
    }

}