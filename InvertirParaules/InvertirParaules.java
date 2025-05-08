package AEA4.InvertirParaules;

import java.io.*;

public class InvertirParaules {
    public static void main(String[] args) {
        String nomArxiuEntrada = "AEA4/InvertirParaules/archivo.txt";
        String nomArxiuSortida = "AEA4/InvertirParaules/archivo_invertido.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(nomArxiuEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(nomArxiuSortida))) {
            
            String linia;
            while ((linia = br.readLine()) != null) {
                bw.write(new StringBuilder(linia).reverse().toString());
                bw.newLine(); 
            }
            System.out.println("Les línies han estat invertides i escrites a " + nomArxiuSortida);
        } catch (IOException e) {
            System.err.println("Error: L'arxiu " + nomArxiuEntrada + " no s'ha trobat o hi ha hagut un problema llegint/escrivint.");
        }
    }
}
