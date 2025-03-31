package MasterMind;

import java.util.Scanner;

public class CodeGenerator {
    Feedback feedback = new Feedback();
    Player player = new Player();

    public final static int LONG_SECRET = 3;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public final static String ENCERTAT = "OOO";
    public static String secret = "";
    public static String resposta = "";

    public String generarParaulaSecreta() {
        String res = "";
        for (int i = 0; i < LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        return abc.charAt(index);
    }

   
}
