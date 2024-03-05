package exercicioWhile;

import java.awt.*;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        int x, y;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();

        while(x != 0 && y!= 0){
            if(x > 0 && y > 0) System.out.println("Primeiro");
            if(x < 0 && y > 0) System.out.println("Segundo");
            if(x < 0 && y < 0) System.out.println("Terceiro");
            if(x > 0 && y < 0) System.out.println("Quarto");
            x = scan.nextInt();
            y = scan.nextInt();

        }
    }
}
