package Reservas;

public class Apartamento extends Alojamiento {
    private int numHabitaciones;
    private boolean tieneCocina;

    public Apartamento(String nombre, int capacidad, int numHabitaciones, boolean tieneCocina) {
        super(nombre, capacidad);
        this.numHabitaciones = numHabitaciones;
        this.tieneCocina = tieneCocina;
    }

    public int getNumHabitaciones(){
        return numHabitaciones;
    }

    public void setNumHabitacions(int numHabitaciones){
        this.numHabitaciones = numHabitaciones;
    }

    public boolean getTieneCocina(){
        return tieneCocina;
    }

    public void setTieneCocina(boolean tieneCocina){
        this.tieneCocina = tieneCocina;
    }

    @Override
    public boolean cumpleCaracteristicas(int caracteristica) {
        if (caracteristica == 1) { 
            return tieneCocina; 
        }
        return true; 
    }

    @Override
    public double calcularPrecio() {
        return 100 + (numHabitaciones * 10);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               "\nTipo: Apartamento" +
               "\nNúmero de habitaciones: " + numHabitaciones +
               "\nTiene cocina: " + (tieneCocina ? "Sí" : "No");
               
    }
}
