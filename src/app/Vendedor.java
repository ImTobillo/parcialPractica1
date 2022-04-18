package app;

import java.util.Date;

public class Vendedor extends Empleado{
    private float montoVentaMensual;

    public Vendedor(int legajo, String nombre, String apellido, String dirección, String fechNac)
    {
        montoVentaMensual = 0;
        setSueldo(0);
        setLegajo(legajo);
        setNombre(nombre);
        setApellido(apellido);
        setDirección(dirección);
        setFechaNac(fechNac);
    }

    public void setMontoVentaMensual(float montoVentaMensual) {
        this.montoVentaMensual = montoVentaMensual;
    }

    public float getMontoVentaMensual() {
        return montoVentaMensual;
    }

    @Override
    public float getSueldo() {
        return 15*montoVentaMensual/100;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "montoVentaMensual=" + montoVentaMensual +
                "} " + super.toString();
    }
}
