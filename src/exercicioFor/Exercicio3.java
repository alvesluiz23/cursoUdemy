package exercicioFor;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        double x,y,z;
        int k;
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        for(int i = 0;i<k;i++){
            x = scan.nextDouble();
            y = scan.nextDouble();
            z = scan.nextDouble();
            System.out.printf("%f\n", (x*2+y*3+z*5)/10);
        }
    }

}
