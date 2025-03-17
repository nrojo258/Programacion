package Reservas;

public abstract class Alojamiento {
    protected String nombre;
    protected int capacidad;
    protected boolean disponible;

    public Alojamiento(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponible = true;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNom(String nombre){
        this.nombre = nombre;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacitat(int capacidad){
        this.capacidad = capacidad;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    public abstract double calcularPrecio();

    public String mostrarInformacion() {
        return "Nombre: " + nombre + 
               "\nCapacidad: " + capacidad + 
               "\nPrecio: " + calcularPrecio() +
               "\nDisponible: " + (disponible ? "Sí" : "No");
    }

    public boolean reservar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void liberar() {
        disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }
}