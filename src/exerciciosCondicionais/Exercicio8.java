package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();

        if(salary >= 0 && salary <= 2000){
            System.out.println("Isento");
        }
        else if(2000.01 <= salary && salary <= 3000){
            System.out.printf("%f", (salary-2000.01)*0.08);
        }
        else if(3000.01 <= salary && salary <=4500){
            System.out.printf("%f", (salary-3000.01)*0.18+80);

        }
        else{
            System.out.printf("%f", (salary-4500)*0.28+270+80);
        }
    }
}
