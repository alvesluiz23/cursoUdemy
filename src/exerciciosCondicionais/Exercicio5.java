package exerciciosCondicionais;

import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        double cust = 0;
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        int amount =scan.nextInt();
        switch (choice){
            case 1:
                cust = amount*4;
                break;
            case 2:
                cust = amount*4.5;
                break;
            case 3:
                cust = amount*5;
                break;
            case 4:
                cust = amount*2;
                break;
            case 5:
                cust = amount*1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f", cust);

    }
}
