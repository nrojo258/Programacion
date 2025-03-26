public class contarDigits {
    public static int contar(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + contar(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("La cuenta de los dígitos de " + num + " es: " + contar(num));
    }
}
