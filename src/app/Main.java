package app;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        App aplicacion = new App();

        aplicacion.agregarVendedor(new Vendedor(1001, "Jorge", "Diaz", "Juan B Justo 4005", "12/03/1990"));
        aplicacion.agregarAdministrador(new Administrador(4005, "Maria", "Jay", "Colon 4885", "12/07/1980", "finanzas"));

        //System.out.println(aplicacion.cantEmpleados());


    }



}
