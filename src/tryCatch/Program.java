package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Program {

    public static void method1(){
        System.out.println("*****METHOD 1 START****************");
        method2();
        System.out.println("*****METHOD 1 ENDo****************");
    }
    public static void method2(){
        Scanner sc =new Scanner(System.in);
        System.out.println("*****METHOD 2 START****************");

        try{
            String[] vet = sc.nextLine().split(" ");
            int postion = sc.nextInt();
            System.out.print(vet[postion]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fora do escopo");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Erro input");
        }
        sc.close();
        System.out.println("*****METHOD 2 ENDo****************");
    }


    public static void main(String[] args){

        method1();



    }
}
