package AEA4.RegistroTemperaturasExcepcions;

import java.util.Scanner;

public class RegistreTemperatures {
  private static final int MAX_SETMANES = 52;

  private boolean fi = false;
  private int numTemperatures = 0;
  private float[] temperatures = new float[MAX_SETMANES * 7];
  private int dia = 1;
  private int mes = 1;

  public static void main (String[] args) {
    RegistreTemperatures programa = new RegistreTemperatures();
    programa.inici();
  }

  public void inici() {
    while (!fi) {
      mostrarMenu();
      tractarOpcio();
    }
  }

  public void mostrarMenu() {
    System.out.println("\nBenvingut al registre de temperatures");
    System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
    System.out.println("[RT] Registrar temperatures setmanals.");
    System.out.println("[MJ] Consultar temperatura mitjana.");
    System.out.println("[DF] Consultar diferència màxima.");
    System.out.println("[FI] Sortir.");
    System.out.print("Opció: ");
  }

  public void tractarOpcio() {
    Scanner lector = new Scanner(System.in);
    String opcio = lector.nextLine();
    if (opcio.equalsIgnoreCase("RT")) {
      registreTemperaturesSetmanals();
    }
    else if (opcio.equalsIgnoreCase("MJ")) {
      mostrarMitjana();
    }
    else if (opcio.equalsIgnoreCase("DF")) {
      mostrarDiferencia();
    }
    else if (opcio.equalsIgnoreCase("FI")) {
      fi = true;
    }
    else {
      System.out.println("Opció incorrecta!\n");
    }
  }

  public void registreTemperaturesSetmanals() {
    if ((numTemperatures + 7) >= temperatures.length) {
      System.out.println("No queda espai per a més temperatures.");
    }
    else {
      llegirTemperaturesTeclat();
      incrementarData();
    }
  }

  public void mostrarMitjana() {
    if (numTemperatures > 0) {
      System.out.print("\nFins avui ");
      mostrarData();
      System.out.print(" la mitjana ha estat de ");
      calculaMitjana();
      System.out.println(" graus.");
    }
    else {
      System.out.println("\nNo hi ha temperatures registrades.");
    }
  }

  public void mostrarDiferencia() {
    if (numTemperatures > 0) {
      System.out.print("\nFins avui ");
      mostrarData();
      System.out.print(" la diferència màxima ha estat de ");
      calculaDiferencia();
      System.out.println(" graus.");
    }
    else {
      System.out.println("\nNo hi ha temperatures registrades.");
    }
  }

  public void llegirTemperaturesTeclat() {
    System.out.println("Escriu les temperatures d’aquesta setmana:");
    Scanner lector = new Scanner(System.in);
    int numLlegides = 0;
    while (numLlegides < 7) {
      if (lector.hasNextFloat()) {
        temperatures[numTemperatures] = lector.nextFloat();
        numLlegides++;
        numTemperatures++;
      }
      else {
        lector.next();
      }
    }
  }

  public void incrementarData() {
    int diesAquestMes = 0;
    if (mes == 2) {
      diesAquestMes = 28;
    }
    else if ((mes == 4)||(mes == 6)||(mes == 9 )||(mes == 11)) {
      diesAquestMes = 30;
    }
    else {
      diesAquestMes = 31;
    }
    dia = dia + 7;
    if (dia > diesAquestMes) {
      dia = dia - diesAquestMes;
      mes++;
      if (mes > 12) {
        mes = 1;
      }
    }
  }

  public void mostrarData() {
    System.out.print(dia + " de ");
    switch(mes) {
      case 1:
        System.out.print("Gener");
        break;
      case 2:
        System.out.print("Febrer");
        break;
      case 3:
        System.out.print("Mar ");
        break;
      case 4:
        System.out.print("Abril");
        break;
      case 5:
        System.out.print("Maig");
        break;
      case 6:
        System.out.print("Juny");
        break;
      case 7:
        System.out.print("Juliol");
        break;
      case 8:
        System.out.print("Agost");
        break;
      case 9:
        System.out.print("Setembre");
        break;
      case 10:
        System.out.print("Octubre");
        break;
      case 11:
        System.out.print("Novembre");
        break;
      case 12:
        System.out.print("Desembre");
    }
  }

 public void calculaMitjana() {
    float acumulador = 0;
    try {
      if (numTemperatures == 0) {
        throw new Exception("No hi ha temperatures registrades.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return;
    }
    for(int i = 0; i < numTemperatures; i++) {
      acumulador = acumulador + temperatures[i];
    }
    System.out.print((acumulador / numTemperatures));
  }

  public void calculaDiferencia() {
    float maxima = temperatures[0];
    float minima = temperatures[0];

    try {
      if (numTemperatures == 0) {
        throw new Exception("No hi ha temperatures registrades.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return;
    }
    for(int i = 1; i < numTemperatures; i++) {
      if (temperatures[i] < minima) {
        minima = temperatures[i];
      }
      if (temperatures[i] > maxima) {
        maxima = temperatures[i];
      }
    }
    System.out.print((maxima - minima));
  }
}
