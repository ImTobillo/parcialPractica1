package app;

public class App {
    private Vendedor vendedores[];
    int cantVendedores;
    private Administrador administradores[];
    int cantAdministradores;

    public App()
    {
        vendedores = new Vendedor[20];
        cantVendedores = 0;
        administradores = new Administrador[20];
        cantAdministradores = 0;
    }

    public void agregarVendedor(Vendedor vend)
    {
        vendedores[cantVendedores] = vend;
        cantVendedores++;
    }

    public void agregarAdministrador(Administrador admin)
    {
        administradores[cantAdministradores] = admin;
        cantAdministradores++;
    }

    public int getCantAdministradores() {
        return cantAdministradores;
    }

    public int getCantVendedores() {
        return cantVendedores;
    }

    public int cantEmpleados()
    {
        return cantAdministradores+cantVendedores;
    }

    public boolean buscarPorLegajoVendedor(int legajo)
    {
        for (int i = 0; i < cantVendedores; i++) {
            if (vendedores[i].getLegajo() == legajo)
                return true;
        }
        return false;
    }

    public boolean buscarPorLegajoAdministrador(int legajo)
    {
        for (int i = 0; i < cantAdministradores; i++) {
            if (administradores[i].getLegajo() == legajo)
                return true;
        }
        return false;
    }

    public Administrador[] getAdministradores() {
        return administradores;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }


}
