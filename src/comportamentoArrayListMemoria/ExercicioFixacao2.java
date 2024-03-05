package comportamentoArrayListMemoria;

import java.util.Scanner;

public class ExercicioFixacao2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] numbers = new double[n];
        double soma = 0;

        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = scan.nextDouble();
        }
        System.out.print("VALORES = ");
        for(int j=0;j<n;j++){
            soma += numbers[j];
            System.out.print(numbers[j]+" ");

        }
        double media = soma/n;
        System.out.printf("\nSoma = %.2f\nMedia = %.2f", soma, media);

    }
}
