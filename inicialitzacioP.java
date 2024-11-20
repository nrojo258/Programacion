public class  inicialitzacioP{
    public static void main(String[] args) {
        int[] arrayValorsDobles = new int [100];
        arrayValorsDobles[0] = 0;

        for(int i = 1; i < arrayValorsDobles.length; i++) {
            arrayValorsDobles[i] = arrayValorsDobles[i -1] + 2;
        }
        System.out.println("S'ha generat l'array: [ ");

        for(int i = 0; i < arrayValorsDobles.length; i++) {
            System.out.println(arrayValorsDobles[i] + " ");
        }
        System.out.println("]");

    }
}
