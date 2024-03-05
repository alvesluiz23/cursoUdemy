package exercicioWhile;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int password = scan.nextInt();

        while(password != 2002){
            System.out.println("Senha invalida");
            password = scan.nextInt();
        }
        System.out.println("Acesso permitido");
        scan.close();

    }
}
