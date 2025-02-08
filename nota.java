import java.util.Scanner;

public class nota{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Mod_Nota2 calcular = new Mod_Nota2();

        double[] valores = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        double minim = calcular.trobarMinim(valores);
        double maxim = calcular.trobarMaxim(valores);
        double mitjana = calcular.calcularMitjana(valores);

        System.out.println("Nota mínimo: " + minim);
        System.out.println("Nota máxima: " + maxim);
        System.out.println("Nota mitjana: " + mitjana);
    }
}