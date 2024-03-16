package ExercicioDeFixacaoJavaException;

import ExercicioDeFixacaoJavaException.model.exception.BalanceException;

public class Conta {
    private int number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Conta(int number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double value){
        this.balance += value;

    }

    public void withdraw(Double value) throws BalanceException {
        if(value > withdrawLimit){
           throw new BalanceException("don't withdraw a over limit value");
        }if(value > balance){
            throw new BalanceException("Not enough balance");
        }
        else {
            this.balance -= value;
            System.out.printf("New balance: %.2f", this.balance);
        }

    }

}
