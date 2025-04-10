package MasterMind;

public class Feedback {
    public static final char TOTALMENTE_CORRECTO = '0';
    public static final char MALA_POSICION = 'X';
    public static final char INCORRECTO = '-';

    public String obtenerRetroalimentacion(String secreto, String intento) {  
        StringBuilder retroalimentacion = new StringBuilder();

        for (int i = 0; i < secreto.length(); i++) {
            char secretoChar = secreto.charAt(i);
            char intentoChar = intento.charAt(i);

            if (intentoChar == secretoChar) {      
                retroalimentacion.append(TOTALMENTE_CORRECTO);
            }
            else if (secreto.indexOf(intentoChar) != -1) {   
                retroalimentacion.append(MALA_POSICION);
            }
            else {      
                retroalimentacion.append(INCORRECTO);
            }
        }
        return retroalimentacion.toString();
    }

    public boolean validarRespuesta(String respuesta) {
        return respuesta != null && respuesta.matches("[a-z]+");
    }
}