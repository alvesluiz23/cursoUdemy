package comportamentoArrayListMemoria;

import java.util.Scanner;

public class ExercicioFixacao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos valores vai ter no vetor: ");
        int n = scan.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];


        System.out.println("Digite os valores do array 1: ");
        for(int i = 0; i<n; i++){
            array1[i] = scan.nextInt();
        }

        System.out.println("Digite os valores do array 2: ");
        for(int j = 0; j<n; j++){
            array2[j] = scan.nextInt();
        }

        System.out.println("Vetor resultante" );
        for(int k = 0; k<n; k++){
            System.out.println(array1[k] + array2[k]);
        }


    }
}
