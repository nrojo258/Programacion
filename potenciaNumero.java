public class potenciaNumero {
    public static int potencia(int base, int exponente) {
        System.out.println("1. En esta iteración base = " + base + ", exponente = " + exponente);
        if (exponente == 0) { 
            System.out.println("2. Estoy en el caso base, exponente = " + exponente);
            return 1; 
        }
        System.out.println("3. En esta iteración, volveré a llamar a la misma función con exponente = " + (exponente - 1));
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponente = 3; 
        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + potencia(base, exponente));
    }
}
