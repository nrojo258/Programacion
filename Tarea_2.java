import java.util.Scanner;
import java.util.Random;

public class Tarea_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Escribe un numero: ");
        int numero = scanner.nextInt();

        System.out.println("Se creara una matriu de 5 X "+ numero);

        int[] matrius = new int[5];

        for(int i = 0; i < matrius.length; i++){
            for(int j = 0; j < numero; j++){
                matrius[i] = random.nextInt(10);
                System.out.print(matrius[i]+ " ");
            }
            System.out.println();
        }
        System.out.println("Se ha creat una matriu de 5 X "+ numero);

    }
}