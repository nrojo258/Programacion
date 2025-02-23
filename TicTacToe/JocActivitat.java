package TicTacToe;

import java.util.Scanner;

public class JocActivitat {
    private lectorTerminal s = new lectorTerminal();
    private TaulerActivitat tauler;
    private char jugadorActual;
    private boolean guanyador;
    private Scanner scanner = new Scanner(System.in);
    private int mida;

    public void iniciarJoc() {
        System.out.println("BENVINGUTS A TIC TAC TOE:");
        System.out.print("Introdueix la mida: ");
        mida = s.LeerInt();
        tauler = new TaulerActivitat(mida);
        EscollirJugador();
        tauler.mostrarTauler();

        while (!guanyador && !tauler.taulerPle()) {
            torn();
            if (tauler.comprobarGuanyador(jugadorActual)) {
                guanyador = true;
                System.out.println("El jugador " + jugadorActual + " ha guanyat");
                tauler.mostrarTauler();
                return;
            }
            if (tauler.taulerPle()) {
                System.out.println("Empat");
                return;
            }
            canviarTorn();
        }
    }

    public void EscollirJugador() {
        do {
            System.out.print("Quin jugador comença? (X / O): ");
            String jugadorEscoltor = scanner.nextLine().trim().toUpperCase();
            if (jugadorEscoltor.equals("X") || jugadorEscoltor.equals("O")) {
                jugadorActual = jugadorEscoltor.charAt(0);
                return;
            }
            System.out.println("Entrada no vàlida, tria X o O.");
        } while (true);
    }

    public void torn() {
        tauler.mostrarTauler();
        System.out.println("Torn del jugador " + jugadorActual);
        int fila, columna;
        do {
            System.out.print("Introdueix la fila (0-" + (mida - 1) + "): ");
            fila = s.LeerInt();
        } while (fila < 0 || fila >= mida);
        do {
            System.out.print("Introdueix la columna (0-" + (mida - 1) + "): ");
            columna = s.LeerInt();
        } while (columna < 0 || columna >= mida);
        tauler.marcarCasella(fila, columna, jugadorActual);
    }

    public void canviarTorn() {
        if (jugadorActual == 'X'){
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }
    }
}