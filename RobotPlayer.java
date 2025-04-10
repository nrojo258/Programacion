package MasterMind;

import java.util.Random;
import java.util.HashMap;

public class RobotPlayer extends Player {
    private Random random = new Random();
    private String ultimoIntento = "";
    private HashMap<Integer, Character> posicionesCorrectas = new HashMap<>();
    private HashMap<Character, Boolean> caracteresIncorrectos = new HashMap<>();
    private HashMap<Character, Boolean> caracteresMalPosicionados = new HashMap<>();

    public RobotPlayer(int longitudCodigo) {
        super(longitudCodigo);
    }

    @Override
    public String hacerIntento() {
        StringBuilder intento = new StringBuilder();
        
        for (int i = 0; i < getLongitudCodigo(); i++) {
            if (posicionesCorrectas.containsKey(i)) {
                intento.append(posicionesCorrectas.get(i));
            } else {
                char c;
                do {
                    c = (char) ('a' + random.nextInt(26));
                } while (caracteresIncorrectos.containsKey(c) || 
                        (caracteresMalPosicionados.containsKey(c) && intento.toString().contains(String.valueOf(c))));
                
                intento.append(c);
            }
        }
        
        ultimoIntento = intento.toString();
        return ultimoIntento;
    }

    public void actualizarIntento(String retroalimentacion) {
        for (int i = 0; i < retroalimentacion.length(); i++) {
            char fb = retroalimentacion.charAt(i);
            char caracterIntento = ultimoIntento.charAt(i);
            
            if (fb == Feedback.TOTALMENTE_CORRECTO) {
                posicionesCorrectas.put(i, caracterIntento);
            } else if (fb == Feedback.MALA_POSICION) {
                caracteresMalPosicionados.put(caracterIntento, true);
            } else if (fb == Feedback.INCORRECTO) {
                caracteresIncorrectos.put(caracterIntento, true);
            }
        }
    }
}