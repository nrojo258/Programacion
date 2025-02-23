package TicTacToe;

import java.util.Scanner;

public class lectorTerminal{

    public double LeerDouble(){
        Scanner s = new Scanner(System.in);
        boolean noleido = true;

        while (noleido){
            if (s.hasNextDouble()){
                noleido = false;
                return s.nextDouble();
            }
            else{
                s.next();
            }
        }
        return 0;
    }

    public int LeerInt(){
        Scanner s = new Scanner(System.in);
        boolean noleido = true;

        while (noleido){
            if (s.hasNextInt()){
                noleido = false;
                return s.nextInt(); 
            }
            else{
                s.next();
            }
        }
        return 0;
    }




}
