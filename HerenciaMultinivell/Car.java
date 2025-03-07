package HerenciaMultinivell;

public class Car {
    private int id;
    
    public Car(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void vehicleType() {
        System.out.println("Tipo de vehiculo: coche");
    }
}