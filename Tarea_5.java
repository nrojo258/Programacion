import java.util.Scanner;

public class Tarea_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz (números entre 0 y 10):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numero;
                do {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    numero = scanner.nextInt();
                    if (numero < 0 || numero > 10) {
                        System.out.println("Por favor, ingrese un número entre 0 y 10.");
                    }
                } while (numero < 0 || numero > 10);
                matriz[i][j] = numero;
            }
        }

        int[] contador = new int[11];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                contador[matriz[i][j]]++;
            }
        }

        System.out.println("Conteo de números en la matriz:");
        for (int i = 0; i <= 10; i++) {
            if (contador[i] > 0) {
                System.out.println("Número " + i + ": " + contador[i] + " veces");
            }
        }
    }
}