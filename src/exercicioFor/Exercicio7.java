package exercicioFor;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i = 0; i<=x; i++){
            System.out.printf("%d %d %d\n", i,(int) Math.pow(i,2),(int) Math.pow(i,3));
        }

    }
}
