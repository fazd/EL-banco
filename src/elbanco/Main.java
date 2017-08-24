
package elbanco;

import model.Banco;
import model.Cliente;
import model.Sucursal;

public class Main {

    public static void main(String[] args) {
        Banco BBVA= new Banco();
        Sucursal a = new Sucursal ("a",BBVA);
        Sucursal b = new Sucursal ("b",BBVA);
        Sucursal c = new Sucursal ("c",BBVA);
        
        Cliente fabio= new Cliente("Fabio",1230,300,a);
        Cliente andrea= new Cliente("andrea",1231,301,a);
        Cliente daniel= new Cliente("daniel",1232,302,a);
        Cliente jose= new Cliente("jose",1233,303,a);

        
        Cliente c1 = new Cliente("c1",1234,304,b);
        Cliente c2 = new Cliente("c2",1235,305,b);
        Cliente c3 = new Cliente("c3",1236,306,b);
        Cliente c4 = new Cliente("c4",1237,307,b);
        Cliente c7 = new Cliente("c7",1238,308,b);

        
        Cliente c5= new Cliente("c5",1238,308,c);
        //Cliente c6= new Cliente("c6",1239,309,c);
        Cliente lupita= new Cliente("lupita",1240,310,c);
        Cliente lucas= new Cliente("lucas",1241,311,c);
        lucas.crearTC();
        lucas.crearTC();
        
        
        
        fabio.crearCDT(500000000);
        fabio.crearPrestamo(500000);
        fabio.agregarDinero(2000000);
        //fabio.crearTC();
        andrea.crearCDT(5000000);
        andrea.agregarDinero(90000000);
        daniel.agregarDinero(1000000);
        jose.crearCDT(1000000);
                
        System.out.println("tiene mas clientes la sucursal "+BBVA.sucursalMasCliente().getNombre());
        System.out.println("el cliente que tiene mas TC es "+BBVA.ClienteMasTC().getNombre());
        System.out.println("el cliente que tiene mas CDT es "+BBVA.ClienteMasCDT().getNombre());

    }
    
}
