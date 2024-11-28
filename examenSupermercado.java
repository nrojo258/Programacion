import java.util.Scanner;

public class examenSupermercado{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvingut/da a la calculadora de preus. Hauràs d'introduir 5 preus de productes per saber si tenen descompte.");
        double descompte = 0.06;
        double resultat = 0;

        for(int productes = 1; productes <= 5; productes++) {
            System.out.println("Introdueix el preu del "+productes+" producte");
            double preu = scanner.nextInt();
            if(preu > 0){
                if(preu > 50){
                    double descompteFet = preu * descompte;
                    if(descompteFet > 15){
                        descompteFet = 15;
                    }
                    preu = preu - descompteFet;
                    resultat = resultat + preu;
                }
                else {
                    resultat = resultat + preu;
                }
                System.out.println("El preu del producte és " + preu);
            }
        }
        System.out.println("El preu final a pagar dels 5 productes és " + resultat + " euros.");
    }
}