package comportamentoArrayListMemoria;

import java.util.Scanner;

public class ExercicioFixacaoq {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];



        for(int i =0;i<n;i++){
            System.out.print("Digite um numero: ");
            numbers[i] = scan.nextInt();
        }

        for(int j = 0;j<n;j++){
            if(numbers[j] < 0) System.out.println(numbers[j]);
        }

    }
}
