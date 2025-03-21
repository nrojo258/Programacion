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

    public boolean cumpleCaracteristicas(int caracteristica) {
        return true; 
    }

    @Override
    public double calcularPrecio() {
        double precioBase = 50;
        if (numCamas > 2) {
            precioBase += (numCamas - 2) * 20;
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
