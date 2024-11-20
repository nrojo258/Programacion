import java.util.Scanner;

public class  loopTrough{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] cars = new String[4];

    for (int i = 0; i < cars.length; i++) {
      System.out.print("Escriu el cotxe " + (i + 1) + ": ");
      cars[i] = scanner.nextLine();
    }

    for(int i = 4; i < cars.length; i++) {
        System.out.println(cars[i]);
    }
  }
}