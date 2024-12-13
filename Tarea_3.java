import java.util.Scanner;

public class Tarea_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de las matrices: ");
        int n = scanner.nextInt();
        
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] matrizResultado = new int[n][n];
        
        System.out.println("Ingrese los valores para la primera matriz (A):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Ingrese los valores para la segunda matriz (B):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Matriz Resultado (A + B):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizResultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}