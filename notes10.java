  public class notes10 {
    public static void main(String[] args) {
        float[] arrayNotes = {2f,5,5f,9f,10f,4,9f,8f,8,5f,7f,6.6f,5f,9f,7f};
        boolean trobat = false;
        int i = 0;

        while(i < arrayNotes.length&&!trobat) {
            if(arrayNotes[i] == 10) {
                trobat = true;
            }
            ++i;
        }
        if(trobat) {
            System.out.println("Algú ha tret un 10.");
        }
        else {
            System.out.println("Ningú ha tret un 10.");
        }
    }
}