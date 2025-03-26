public class numeros_integers {
    public static int sumar(int n) {
        System.out.println("1. En esta iteración n = " + n);
        if (n == 0) { 
            System.out.println("2. Estoy en el caso base, n = " + n);
            return 0; 
        }
        System.out.println("3. En esta iteración, volveré a llamar a la misma función con n = " + (n - 1));
        return n + sumar(n - 1);
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println("La suma de los números desde " + num + " hasta 1 es: " + sumar(num));
    }
}
