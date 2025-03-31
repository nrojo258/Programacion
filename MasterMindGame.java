package MasterMind;

import static MasterMind.CodeGenerator.*;
import static MasterMind.Feedback.*;

public class MasterMindGame {
    CodeGenerator codeGenerator = new CodeGenerator(); 
    Feedback feedback = new Feedback(); 
    Player player = new Player(); 

    public final static String ENCERTAT = "OOO";
    public static String secret = "";
    public static String resposta = "";

    public static void main(String[] args) {
        MasterMindGame programa = new MasterMindGame();

        programa.secret = programa.codeGenerator.generarParaulaSecreta();
        boolean encertat = false;
        while (!encertat) {
            resposta = programa.player.preguntarResposta();
            encertat = programa.feedback.resoldreResposta(secret, resposta);
        }
    }
}