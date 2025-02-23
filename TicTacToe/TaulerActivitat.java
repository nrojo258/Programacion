package TicTacToe;

public class TaulerActivitat {
    private char[][] tauler;
    private int mida;

    public TaulerActivitat(int mida) {
        this.mida = mida;
        tauler = new char[mida][mida];
        iniciarTauler();
    }

    public void iniciarTauler() {
        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                tauler[i][j] = '-';
            }
        }
    }

    public void mostrarTauler() {
        for (char[] fila : tauler) {
            for (char casella : fila) {
                System.out.print(casella + " ");
            }
            System.out.println();
        }
    }

    public boolean marcarCasella(int fila, int columna, char jugadorActual) {
        if (tauler[fila][columna] == '-') {
            tauler[fila][columna] = jugadorActual;
            return true;
        } else {
            System.out.println("Casella ocupada, tria una altra.");
            return false;
        }
    }

    public boolean comprobarGuanyador(char jugador) {
        for (int i = 0; i < mida; i++) {
            if (comprovarFila(i, jugador) || comprovarColumna(i, jugador)) {
                return true;
            }
        }
        return comprovarDiagonals(jugador);
    }

    public boolean comprovarFila(int fila, char jugador) {
        for (int j = 0; j < mida; j++) {
            if (tauler[fila][j] != jugador) return false;
        }
        return true;
    }

    public boolean comprovarColumna(int columna, char jugador) {
        for (int i = 0; i < mida; i++) {
            if (tauler[i][columna] != jugador) return false;
        }
        return true;
    }

    public boolean comprovarDiagonals(char jugador) {
        boolean principal = true, secundaria = true;
        for (int i = 0; i < mida; i++) {
            if (tauler[i][i] != jugador) principal = false;
            if (tauler[i][mida - 1 - i] != jugador) secundaria = false;
        }
        return principal || secundaria;
    }

    public boolean taulerPle() {
        for (char[] fila : tauler) {
            for (char casella : fila) {
                if (casella == '-') return false;
            }
        }
        return true;
    }
}