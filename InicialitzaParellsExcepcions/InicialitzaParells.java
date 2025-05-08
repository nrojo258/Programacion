package AEA4.InicialitzaParellsExcepcions;

public class InicialitzaParells {
    public static void main(String[] args) {    
        try {
            int[] arrayParells = new int[100];

            for(int i = 0; i <= arrayParells.length; i++) {
            arrayParells[i] = 2*i;
            }
        } 

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Error! Fuera de límites");
        }

        finally {
            System.out.println("El programa ha acabat.");
        }
    }
}
