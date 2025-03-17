package Reservas;

public class Habitacion extends Alojamiento{
    private int numCamas;

    public Habitacion(String nombre, int capacidad, int numCamas) {
        super(nombre, capacidad);
        this.numCamas = numCamas;
    }
    
    public int getNumCamas(){
        return numCamas;
    }

    public void setNumCamas(int numCamas){
        this.numCamas = numCamas;
    }

    @Override
    public double calcularPrecio() {
        double precioBase = 50;
        if (numCamas > 3) {
            precioBase += (numCamas - 3) * 20;
        }
        return precioBase;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + 
               "\nTipo: Habitación Estándar" +
               "\nNúmero de camas: " + numCamas;
    }

}
