import java.util.Scanner;

public class Tarea_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");
        int numero = scanner.nextInt();
        int[] vector = new int[numero];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < numero; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        int primerMinimo = Integer.MAX_VALUE;
        int segundoMinimo = Integer.MAX_VALUE;

        for (int num : vector) {
            if (num < primerMinimo) {
                segundoMinimo = primerMinimo; 
                primerMinimo = num; 
            } else if (num < segundoMinimo && num != primerMinimo) {
                segundoMinimo = num; 
            }
        }

        if (segundoMinimo == Integer.MAX_VALUE) {
            System.out.println("No hay un segundo elemento más pequeño (todos los elementos son iguales).");
        } else {
            System.out.println("El segundo elemento más pequeño es: " + segundoMinimo);
        }
    }
}