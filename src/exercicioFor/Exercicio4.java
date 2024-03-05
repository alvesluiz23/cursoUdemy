package exercicioFor;

import java.util.Scanner;

public class Exercicio4 {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        double k = scan.nextDouble();
        double x,y;

        for(int i =0; i < k;i++){
            x = scan.nextDouble();
            y = scan.nextDouble();
            if(y == 0) System.out.println("divisao impossivel");
            else System.out.println(x/y);
        }
    }
}
