package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        while(true){
            System.out.println("Entre com um numero :");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            System.out.println((x > 0)? "NAO NEGATIVO" : "NEGATIVO");
        }
    }
}
