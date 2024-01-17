package Modelos;

public class VehiculoMotorizado extends Vehiculo{
    private String combustible;

    public VehiculoMotorizado(String marca, String modelo, int year, String combustible) {
        super(marca, modelo, year);
        this.combustible = combustible;
    }

    public String mostrarDetalle() {
        return "VehiculoMotorizado{" +
                "combustible='" + combustible + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}
