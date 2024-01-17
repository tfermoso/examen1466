package Modelos;

public class Motocicleta extends VehiculoMotorizado{
    private String tipo;

    public Motocicleta(String marca, String modelo, int year, String combustible, String tipo) {
        super(marca, modelo, year, combustible);
        this.tipo = tipo;
    }


    public String mostrarDetalles() {
        return "Motocicleta{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}
