package Reservas;

public class CasaRural extends Alojamiento{
    private boolean tieneJardin;
    private boolean tienePiscina;

    public CasaRural(String nombre, int capacidad, boolean tieneJardin, boolean tienePiscina) {
        super(nombre, capacidad);
        this.tieneJardin = tieneJardin;
        this.tienePiscina = tienePiscina;
    }
    
    public boolean getTieneJardin(){
        return tieneJardin;
    }

    public void setTieneJardin(boolean tieneJardin){
        this.tieneJardin = tieneJardin;
    }

    public boolean getTienePiscina(){
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina){
        this.tienePiscina = tienePiscina;
    }

    @Override
    public boolean cumpleCaracteristicas(int caracteristica) {
        if (caracteristica == 2) { 
            return tieneJardin; 
        } 
        else if (caracteristica == 3) { 
            return tienePiscina;
        }
        return true; 
    }

    @Override
    public double calcularPrecio() {
        double precio = 150;
        if (tienePiscina) {
            precio += 50;
        }
        return precio;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               "\nTipo: Casa Rural" +
               "\nTiene jardín: " + (tieneJardin ? "Sí" : "No") +
               "\nTiene piscina: " + (tienePiscina ? "Sí" : "No");
    }
}
