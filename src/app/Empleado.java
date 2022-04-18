package app;

import java.util.Date;
import java.util.Objects;

public class Empleado {
    private int legajo;
    private String nombre;
    private String apellido;
    private String dirección;
    private String fechaNac;
    private float sueldo;

    public Empleado()
    {
        sueldo = 0;
        legajo = 0;
        nombre = null;
        apellido = null;
        dirección = null;
        fechaNac = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dirección='" + dirección + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Empleado emp = (Empleado)obj;

        if (emp != null && legajo == emp.getLegajo())
            return true;
        else
            return false;
    }

}
