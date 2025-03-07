package HerenciaMultinivell;

public class Arona extends Seat{
    private String color; 
    private int km;
    
    public Arona(int id, String model, String color, int km ){
        super(id, model);
        this.color = color;
        this.km = km;
    }

    public String getColor(){
        return color;
    }

    public int getKm(){
        return km;
    }

    public void brand(){
        System.out.println("Marca: Seat");
    }

    public void speed(){
        System.out.println("Velocidad max: 90 kmph");
    }

    public static void main(String args[]){
        Arona obj = new Arona(1, "Ibiza", "Rojo", 5000);
        System.out.println("Id: "+ obj.getId());
        System.out.println("Modelo: "+ obj.getModel());
        System.out.println("Color: "+ obj.getColor());
        System.out.println("Kilometraje: "+ obj.getKm() + " Km/h");

        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}