package MasterMind;

import java.util.Scanner;

public class AdultHumanPlayer extends Player {
    private Scanner lector = new Scanner(System.in);

    public AdultHumanPlayer() {
        super(5); 
    }

    @Override
    public String hacerIntento() {
        System.out.print("Jugador adulto, escribe 5 letras: ");
        return lector.nextLine();
    }
}