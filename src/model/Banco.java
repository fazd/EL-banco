package model;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Sucursal> sucursales;

    public Banco() {
        sucursales=new ArrayList();
    }
    
    
    
    
    public void addSucursal(Sucursal s){
        sucursales.add(s);
    }
    
    public Sucursal sucursalMasCliente(){
        int max=-1;
        Sucursal mejor= new Sucursal("d",this);
        for(Sucursal sucursal : sucursales){
            if(sucursal.getTotalClientes()>max){
                max=sucursal.getTotalClientes();
                mejor=sucursal;
            }
        }
        return mejor;
    }
    
    public Cliente ClienteMasTC(){
        int max=-1;
        Cliente mejor= new Cliente("h",123,12,new Sucursal("d",this));
        for(Sucursal sucursal : sucursales){
            if(sucursal.masTC().getIndexTC()>max){
                max=sucursal.masTC().getIndexTC();
                mejor=sucursal.masTC();
            }
        }
        return mejor;
    }
    
    public Cliente ClienteMasCDT(){
        float max=-1;
        Cliente mejor= new Cliente("h",123,12,new Sucursal("d",this));
        for(Sucursal sucursal : sucursales){
            if(sucursal.masCDT().getCDT()>max){
                max=sucursal.masCDT().getCDT();
                mejor=sucursal.masCDT();
            }
        }
        return mejor;
    }
    
    public EjecutivoVIP ejecutivoMasProd(){
        EjecutivoVIP mejor= sucursales.get(0).ejecutivoMasProductos();
        int max=mejor.totalProductos();
        for(Sucursal sucursal : sucursales){
            if(sucursal.ejecutivoMasProductos().totalProductos()>max){
                mejor=sucursal.ejecutivoMasProductos();
                max=mejor.totalProductos();
            }
        }
        return mejor;
    }
    
    public EjecutivoVIP ejecutivoMasPlata(){
        EjecutivoVIP mejor= sucursales.get(0).ejecutivoMasPlata();
        float max=mejor.totalPlata();
        for(Sucursal sucursal : sucursales){
            if(sucursal.ejecutivoMasPlata().totalPlata()>max){
                mejor=sucursal.ejecutivoMasPlata();
                max=mejor.totalPlata();
            }
        }
        return mejor;
    }
    
    
    
    
    
}