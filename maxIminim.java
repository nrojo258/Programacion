import java.util.Scanner;

public class  maxIminim{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 8;
    int[] numero = new int[n];

    System.out.println("Ingresa " + n + " numeros:");
    for(int i = 0; i < n; i++) {
        System.out.println("Numero "+(i+1)+ ":");
        numero[i] = scanner.nextInt();
    }

    int min = numero[0];
    int max = numero[0];

    for(int i = 1; i < n; i++) {
        if(numero[i] < min) {
            min = numero[i];            
        }
        if(numero[i] > max) {
            max = numero[i];
        }
    }
    System.out.println("El numero mes petit es: "+min);
    System.out.println("El numero mes gran es: "+max);
}
}