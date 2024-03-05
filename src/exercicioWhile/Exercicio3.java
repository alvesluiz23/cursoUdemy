package exercicioWhile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        int amountAlchool, amountGas, amountDiesel;
        int[] arrayFuel = new int[3];
        for(int i = 0; i<3;i++){
            arrayFuel[i] = 0;
        }


        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while (input !=4 ){
            if(input < 4){
                arrayFuel[input-1]++;
            }
            input = scan.nextInt();
        }
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel:%d",arrayFuel[0], arrayFuel[1], arrayFuel[2]);
        scan.close();

    }
}
