public class matrius {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("MATRIU");
        System.out.println("---------------------");

        int [][] matriuParells = new int[10][10];
        
        System.out.println();
        for(int i = 0; i < matriuParells.length; i++) {
            for(int j = 0; j < matriuParells[i].length; j++) {
                if (i % 2 == 0 || j % 2 == 0) {
                    matriuParells[i][j] = -1;
                }
                System.out.print(matriuParells[i][j]+ " ");
            }
            System.out.println("   --> Fila " + i);
        }
    }
}
