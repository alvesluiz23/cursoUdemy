package introducaoPoo;


import java.util.Scanner;

class Conta{
    private String numeroConta, titularConta;
    double saldo = 0;

    Conta(String titularConta,String numeroConta,double saldoInicial){
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        deposita(saldoInicial);
        System.out.println("Conta criada\n"+this);
    }
    Conta( String titularConta,String numeroConta){
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        System.out.println("Conta criada\n"+this);
    }

    public void setTitularConta(String novoNome){
        this.titularConta = novoNome;
    }

    public void deposita(double valor){
        this.saldo += valor;
        System.out.println(this);
    }

    public void saca(double valor) {
        if (valor + 5 <= this.saldo) {
            this.saldo -= valor + 5;
            System.out.println(this);

        } else {
            System.out.printf("[Error] Sem saldo suficiente (Seu saldo e de %f)", this.saldo);
        }
    }


    public String toString(){
        return this.numeroConta + " Titular "+this.titularConta+" Saldo R$ "+String.format("%.2f", this.saldo);
    }


}

public class ExercicioFixacao {
    public static void main(String[] args) {
        Conta conta;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome ");
        String nome = scan.next();
        System.out.print("Digite o numero da conta ");
        String numeroConta = scan.next();
        System.out.print("Deseja adicionar um saldo? ");
        int comSaldo = scan.nextInt();
        if(comSaldo == 1){
            System.out.print("Digite um valor para adicionar ");
            double saldo = scan.nextDouble();;
            conta = new Conta(nome, numeroConta, saldo);
        }else{
            conta = new Conta(nome, numeroConta);
        }
        conta.saca(200);
        conta.setTitularConta("Eduardo");
        conta.deposita(200);
    }
}
