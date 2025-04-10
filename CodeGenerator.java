package MasterMind;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class CodeGenerator {
    private static final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";
    private Random random = new Random();

    public String generarCodigo(int longitud) {
        ArrayList<Character> letrasDisponibles = new ArrayList<>();
        for (char c : ALFABETO.toCharArray()) {
            letrasDisponibles.add(c);
        }
        Collections.shuffle(letrasDisponibles, random);  

        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            codigo.append(letrasDisponibles.get(i));  
        }
        return codigo.toString();
    }
}