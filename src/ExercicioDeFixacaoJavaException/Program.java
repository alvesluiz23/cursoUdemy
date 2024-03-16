package ExercicioDeFixacaoJavaException;

import ExercicioDeFixacaoJavaException.model.exception.BalanceException;

import java.security.PublicKey;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Conta conta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = scan.nextInt();
        System.out.print("Holder: ");
        String holder = scan.next();
        System.out.print("Initial balance: ");
        Double balance = scan.nextDouble();
        System.out.print("Withdraw limit: ");
        Double limit = scan.nextDouble();
        conta = new Conta(number, holder, balance, limit);

        System.out.print("Enter amount for withdraw: ");
        try{
            conta.withdraw(scan.nextDouble());
        }
        catch(BalanceException e){
            System.out.print("Withdraw error: "+e.getMessage());
        }


    }
}
