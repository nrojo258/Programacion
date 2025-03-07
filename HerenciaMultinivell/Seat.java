package HerenciaMultinivell;

public class Seat extends Car{
    private String model;

    public Seat(int id, String model){
        super(id);
        this.model = model;
    }

    public String getModel(){
        return model;
    }    
}