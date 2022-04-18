package app;

public class Repartidor {
    private String nombreYApellido;
    private int kmsRecorridosMensuales;

    public Repartidor(String nombreYApellido)
    {
        this.nombreYApellido = nombreYApellido;
        kmsRecorridosMensuales = 0;
    }

    public void agregarKms(float kms)
    {
        kmsRecorridosMensuales += kms;
    }

    public int informarSueldo()
    {
        return kmsRecorridosMensuales*3;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public float getKmsRecorridosMensuales() {
        return kmsRecorridosMensuales;
    }

    public void setKmsRecorridosMensuales() {
        kmsRecorridosMensuales = 0;
    }


}
