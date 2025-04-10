package MasterMind;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Feedback retroalimentacion = new Feedback();
    private Scanner lector = new Scanner(System.in);

    public HumanPlayer(int longitudCodigo) {
        super(longitudCodigo);
    }

    public String preguntarRespuesta() {
        boolean lecturaOk = false;
        String res = null;
        do {
            System.out.print("Escribe " + getLongitudCodigo() + " letras minúsculas: ");
            res = lector.next();
            lector.nextLine();
            lecturaOk = retroalimentacion.validarRespuesta(res);
            if (!lecturaOk) {
                System.out.println("¡Esta respuesta no es válida!");
            }
        } while (!lecturaOk);
        return res;
    }

    @Override
    public String hacerIntento() {
        return preguntarRespuesta();
    }
}