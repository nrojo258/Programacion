import java.util.ArrayList;
import java.util.Random;

public class Tarea_1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Se creara una matriz de 5 X 5");

        int[][] matrius = new int[5][5];
        int sumaTotal = 0;
        int maxNumero = Integer.MIN_VALUE;
        int contadorMax = 0;
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        int sumaUltimaFila = 0;

        for(int i = 0; i < matrius.length; i++){
            for(int j = 0; j < matrius[i].length; j++){
                matrius[i][j] = random.nextInt(100);
                System.out.print(matrius[i][j]+ " ");
                sumaTotal += matrius[i][j];

            if (matrius[i][j] > maxNumero) {
                maxNumero = matrius[i][j];
                contadorMax = 1;
            } else if (matrius[i][j] == maxNumero) {
                contadorMax++;
            }

            if (esPrimo(matrius[i][j])) {
                primos.add(matrius[i][j]);
            }

            if (matrius[i][j] % 2 == 0) {
                pares.add(matrius[i][j]);
            }

            if (i == j) {
                sumaDiagonalPrincipal += matrius[i][j];
            }
            if (i + j == 4) {
                sumaDiagonalSecundaria += matrius[i][j];
            }
        }
    }

    for (int j = 0; j < 5; j++) {
        sumaUltimaFila += matrius[4][j];
    }

    System.out.println("Matriz:");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(matrius[i][j] + "\t");
        }
        System.out.println();
    }

    System.out.println("Promedio de la matriz: " + (sumaTotal / 25.0));
    System.out.println("Número mayor: " + maxNumero + ", se repite: " + contadorMax + " veces");
    System.out.println("Números primos: " + primos);
    System.out.println("Números pares: " + pares);
    System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
    System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
    System.out.println("Suma de la última fila: " + sumaUltimaFila);
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
