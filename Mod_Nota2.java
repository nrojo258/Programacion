public class Mod_Nota2{
    public static double trobarMinim(double[] valores) {
        double minim = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < minim) {
                minim = valores[i];
            }
        }
        return minim;
    }
    
    public static double trobarMaxim(double[] valores) {
        double maxim = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maxim) {
                maxim = valores[i];
            }
        }
        return maxim;
    }
    
    public static double calcularMitjana(double[] valores) {
        double suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        return suma / valores.length;
    }
}