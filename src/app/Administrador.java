package app;

import java.util.Date;

public class Administrador extends Empleado{
    private String area;

    public Administrador(int legajo, String nombre, String apellido, String dirección, String fechNac, String area)
    {
        this.area = area;
        setSueldo(15);
        setLegajo(legajo);
        setNombre(nombre);
        setApellido(apellido);
        setDirección(dirección);
        setFechaNac(fechNac);
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "area='" + area + '\'' +
                "} " + super.toString();
    }


}
