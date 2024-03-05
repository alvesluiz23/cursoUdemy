package comportamentoArrayListMemoria;

import java.util.Scanner;

public class mediaAltura {
    public static void main(String[] args){
        double[] alturas = new double[3];
        double soma = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i <3; i++){
            alturas[i] = scan.nextInt();
        }

        for(int i = 0; i <3; i++){
            soma += alturas[i];
        }
        System.out.printf("AVARAGE HEIGHT = %.2f ", soma/3);



    }
}
