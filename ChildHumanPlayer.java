package MasterMind;

import java.util.Scanner;

public class ChildHumanPlayer extends Player {
    Scanner lector = new Scanner(System.in);

    public ChildHumanPlayer() {
        super(3); 
    }

    @Override
    public String hacerIntento() {
        System.out.print("Jugador niño, escribe 3 letras: ");
        return lector.nextLine();
    }
}