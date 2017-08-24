/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;

/**
 *
 * @author fabioandres
 */
public class EjecutivoVIP {
    private final Sucursal sucursal;
    private ArrayList <Cliente> clientesVIP;

    public EjecutivoVIP(Sucursal sucursal) {
        this.sucursal = sucursal;
        this.clientesVIP= new ArrayList();
    }
    
    public int totalProductos(){
        int total=0;
        for(Cliente cliente: clientesVIP){
            total+=cliente.getProductos();
        }
        return total;
    }
    
    public float totalPlata(){
        float total=0;
        for(Cliente cliente: clientesVIP){
            total+=cliente.getTotal();
        }
        return total;
    }
    
    public void eliminarCliente(Cliente e){
        clientesVIP.remove(e);
    }
    
    
    public void agregarCliente(Cliente e){
        clientesVIP.add(e);
    }

    public ArrayList<Cliente> getClientesVIP() {
        return clientesVIP;
    }
    
}
