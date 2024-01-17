package Modelos;

public class Automovil extends VehiculoMotorizado{
    private int puertas;

    public Automovil(String marca, String modelo, int year, String combustible, int puertas) {
        super(marca, modelo, year, combustible);
        this.puertas = puertas;
    }


    public String mostrarDetalles() {
        return "Automovil{" +
                "puertas=" + puertas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}
