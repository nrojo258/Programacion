package MasterMind;

import static MasterMind.CodeGenerator.*;
import static MasterMind.Feedback.*; 
import java.util.Scanner;

public class Player {
    Feedback feedback = new Feedback();

    public String preguntarResposta() {
        Scanner lector = new Scanner(System.in);
        boolean lecturaOk = false;
        String res = null;
        do {
            System.out.print("Escriu " + LONG_SECRET + " lletres miníscules: ");
            res = lector.next();
            lector.nextLine();
            lecturaOk = feedback.comprovarResposta(res);
            if (!lecturaOk) {
                System.out.println("Aquesta resposta no és vàlida!");
            }
        } while (!lecturaOk);
        return res;
    }

}
