package exerciciosCondicionais;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        while(true){
            Scanner scan = new Scanner(System.in);
            int tempoInicio = scan.nextInt();
            int tempoFinal = scan.nextInt();
            int duracao;

            if(tempoFinal <= tempoInicio){
                duracao = tempoFinal + (24-tempoInicio);
            }else{
                duracao = tempoFinal - tempoInicio;
            }

            System.out.printf("O jogo durou %d hora(s)\n", duracao);

        }
    }
}
