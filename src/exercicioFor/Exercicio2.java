package exercicioFor;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y;
        int in,out;
        in = 0;
        out = 0;

        for(int i =0; i<x;i++){
            y = scan.nextInt();
            if(y >= 10 && y <= 20) in++;
            else out++;

        }
        System.out.printf("%d in\n%d out", in, out);
    }
}
