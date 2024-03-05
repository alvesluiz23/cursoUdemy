package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        while(true){
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            System.out.println((x%2==0)? "Par" : "Impar");

        }
    }
}
