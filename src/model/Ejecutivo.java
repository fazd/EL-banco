/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Ejecutivo {
    private final Sucursal sucursal;
    private ArrayList <Cliente> clientes;

    public Ejecutivo(Sucursal sucursal) {
        this.sucursal = sucursal;
        this.clientes= new ArrayList();
    }
    
    public void eliminarCliente(Cliente e){
        clientes.remove(e);
    }
    
    public void agregarCliente(Cliente e){
        clientes.add(e);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    
}
