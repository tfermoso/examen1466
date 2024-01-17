import Modelos.Automovil;
import Modelos.Motocicleta;
import Modelos.Vehiculo;
import Modelos.VehiculoMotorizado;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1=new Vehiculo("Seat","Leon",2008);
        System.out.println(vehiculo1.mostrarDetalles());
        VehiculoMotorizado vehiculoMotorizado = new VehiculoMotorizado("Opel","kadet",1989,"gasolina");
        System.out.println(vehiculoMotorizado.mostrarDetalle());
        Automovil automovil=new Automovil("mercedes","slk",2006,"gasolina",4);
        System.out.println(automovil.mostrarDetalle());
        Motocicleta moto=new Motocicleta("honda","jkl",2009,"gasolina","carretera");
        System.out.println(moto.mostrarDetalles());

    }
}