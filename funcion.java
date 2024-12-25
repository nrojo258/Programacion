public class funcion {
    public static void main(String[] args) {
        System.out.println("Esperando output: ");
        
        escriu('*', 7);   
        escriu('-', 1);   
        escriu(6, 5);     
        escriu('*', 3);   
        escriu('-', 5);   
        escriu(2, 3);     
    }

    public static void escriu(Object numero, int cant) {
        for (int i = 0; i < cant; i++) {
            System.out.print(numero);
        }
        System.out.println(); 
    }
}