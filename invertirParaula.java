public class invertirParaula {
    public String invertir(String paraula) {
        if (paraula.length() <= 1) {
            return paraula;
        }
        return paraula.charAt(paraula.length() - 1) + invertir(paraula.substring(0, paraula.length() - 1));
    }

    public static void main(String[] args) {
        invertirParaula invertir = new invertirParaula();
        String paraula = "hola"; 
        System.out.println("La paraula invertida de " + paraula + " es: " + invertir.invertir(paraula));
    }
}
