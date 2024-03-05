package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double numberInput = scan.nextDouble();


        if(numberInput > 25 && numberInput <=50){
            System.out.println("Intervalo (25,50]");
        }
        else if(numberInput <= 25 && numberInput >= 0){
            System.out.println("Intervalo [0,25]");
        }
        else if(numberInput > 75 && numberInput <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora do intervalo");
        }

    }
}
