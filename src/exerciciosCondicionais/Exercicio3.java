package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        while(true){
            Scanner scan = new Scanner(System.in);
            int firtsNumeber = scan.nextInt();
            int secondNumber = scan.nextInt();
            System.out.println((firtsNumeber % secondNumber == 0 || secondNumber % firtsNumeber == 0 ) ? "Divisor" : "Nao divisor" );
        }
    }
}
