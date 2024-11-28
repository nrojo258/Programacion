import java.util.Arrays;

public class  ordenado{
    public static void main(String[] args) {
    int n = 8;
    int[] numero = {12,3,45,-3, 65,-5,88,99,2,23,54,33,27,53,96,0};
    Arrays.sort(numero);

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