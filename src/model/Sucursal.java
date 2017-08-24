package model;

import java.util.ArrayList;

public class Sucursal {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Ejecutivo> ejecutivos;
    private ArrayList<EjecutivoVIP> ejecutivosVIP;
    private Banco Banco;
    private String nombre;
    
    
    public Sucursal(String nombre,Banco b) {
        this.Banco=b;
        this.nombre=nombre;
        this.clientes=new ArrayList();
        this.ejecutivos=new ArrayList();
        this.ejecutivosVIP=new ArrayList();
        b.addSucursal(this);
        addEjecutivo();
        addEjecutivoVIP();
    }

    public Ejecutivo obtenerEjecutivo(){
        return ejecutivos.get((int) (Math.random() * ejecutivos.size()));
    }
    
    public EjecutivoVIP obtenerEjecutivoVIP(){
        return ejecutivosVIP.get((int) (Math.random() * ejecutivosVIP.size()));
    }

    public String getNombre() {
        return nombre;
    }
    
    public void addCliente(Cliente a){
        clientes.add(a);
        Ejecutivo temp=obtenerEjecutivo();
        a.setEjecutivo(temp);
        temp.agregarCliente(a);
        
    }
    
    private void addEjecutivo(){
        Ejecutivo e = new Ejecutivo(this);
        Ejecutivo e2 = new Ejecutivo(this);
        Ejecutivo e3 = new Ejecutivo(this);
        ejecutivos.add(e);
        ejecutivos.add(e2);
        ejecutivos.add(e3);
    }
    
     private void addEjecutivoVIP(){
        EjecutivoVIP e = new EjecutivoVIP(this);
        EjecutivoVIP e2 = new EjecutivoVIP(this);
        EjecutivoVIP e3 = new EjecutivoVIP(this);
        ejecutivosVIP.add(e);
        ejecutivosVIP.add(e2);
        ejecutivosVIP.add(e3);
    }
     
     public EjecutivoVIP ejecutivoMasProductos(){
         EjecutivoVIP mejor= ejecutivosVIP.get(0);
         int max=mejor.totalProductos();
         for (EjecutivoVIP ejecutivoVIP: ejecutivosVIP ) {
             if(ejecutivoVIP.totalProductos()>max){
                 mejor=ejecutivoVIP;
                 max=mejor.totalProductos();
             }
         }
         return mejor;
     }
     
     public EjecutivoVIP ejecutivoMasPlata(){
         EjecutivoVIP mejor= ejecutivosVIP.get(0);
         float max=mejor.totalPlata();
         for (EjecutivoVIP ejecutivoVIP: ejecutivosVIP ) {
             if(ejecutivoVIP.totalPlata()>max){
                 mejor=ejecutivoVIP;
                 max=mejor.totalPlata();
             }
         }
         return mejor;
     }
     
     public int getTotalClientes(){
         return clientes.size();
     }
     
     
     public Cliente masTC(){
         int max=-1;
         Cliente mejor= new Cliente("h",12,123,this);
         for(Cliente cliente: clientes){
             if(cliente.getIndexTC()!=0){
                if(cliente.getIndexTC()>max){
                    max=cliente.getIndexTC();
                    mejor=cliente;
                }
             }
         }
         return mejor;
     }
     
     
     public Cliente masCDT(){
         float max=-1;
         Cliente mejor= new Cliente("h",12,123,this);
         for(Cliente cliente: clientes){
             if(cliente.getCDT()!=0){
                if(cliente.getCDT()>max){
                    max=cliente.getCDT();
                    mejor=cliente;
                }
             }
        }
         return mejor;
     }

     
    /*public float totalConsignado(Cliente [] CL){
        float Total=0;
        for (int i = 0; i < indexC; i++) {
            Total=Total + CL[i].getCuenta();
        }
        return Total;
    }*/
    
    /*public float totalPrestamo(Cliente [] CL){
        float Total=0;
        for (int i = 0; i < indexC; i++) {
            Total+=CL[i].getPrestamo();
        }
        return Total;
    }*/
    
    /*public float totalCDT(Cliente [] CL){
        float Total=0;
        for (int i = 0; i < indexC; i++) {
            Total+=CL[i].getCDT();
        }
        return Total;
    }*/
    /*
    public Cliente getMejorCliente(){
        Cliente mejor=clientes[0];
        float max=mejor.getCuenta();
        for (int i = 1; i < indexC; i++) {
            if(clientes[i].getCuenta()>max){
                mejor=clientes[i];
                max=mejor.getCuenta();
            }
        }
        return mejor;
    }*/
    

}