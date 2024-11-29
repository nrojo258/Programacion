import java.util.Scanner;
    
public class notes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] notes = new double[6];
        double resultat = 0;
        double nota = 0;  

        for(int i = 0; i < notes.length; i++){
            System.out.println("Escriu la nota que has tret, ente 0 i 10");
            if(lector.hasNextDouble()){
                nota = lector.nextDouble();
                if(nota>=0&&nota<=10){
                    resultat += nota;
                    notes[i] = nota;
                    System.out.println("Nota afegida");
                }
            }
        }
    }
}
