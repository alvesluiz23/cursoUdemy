package exercicioFor;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        int n;
        int fat = 1;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1; i<=n;i++){
            fat *= i;
        }
        System.out.println(fat);

        scan.close();
    }
}
