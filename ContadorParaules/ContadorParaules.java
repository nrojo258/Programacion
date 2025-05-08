package AEA4.ContadorParaules;

import java.io.*;

public class ContadorParaules {
    public static void main(String[] args) {
        String entrada = "AEA4/ContadorParaules/entrada.txt";  
        String salida = "AEA4/ContadorParaules/salida.txt";

        try {
            int conteo = contarParaules(entrada);
            escribirConteo(salida, conteo);
            System.out.println("Conteo realizado correctamente. Verifica el archivo 'salida.txt'.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo '" + entrada + "' no se ha encontrado.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static int contarParaules(String ruta) throws IOException {
        int contador = 0;
        InputStream inputStream = ContadorParaules.class.getClassLoader().getResourceAsStream(ruta);

        if (inputStream == null) {
            throw new FileNotFoundException("No se pudo encontrar el archivo: " + ruta);
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    contador += linea.trim().split("\\s+").length;
                }
            }
        }
        return contador;
    }

    private static void escribirConteo(String ruta, int conteo) throws IOException {
        File file = new File(ruta);
        file.getParentFile().mkdirs();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("El archivo tiene " + conteo + " palabras.");
        }
    }
}
