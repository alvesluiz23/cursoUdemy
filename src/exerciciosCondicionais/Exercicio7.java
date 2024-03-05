package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = scan.nextDouble();

        if(x >= 0 && y > 0){
            System.out.println("Q1\n");
        }
        if(x < 0 && y > 0){
            System.out.println("Q2\n");
        }
        if(x < 0 && y < 0){
            System.out.println("Q3\n");
        }
        if(x > 0 && y < 0){
            System.out.println("Q4\n");
        }else{
            System.out.println("Origem");
        }



    }
}
