package heranca;

public class ProgramaSobreposicao {
    public static void main(String[] args){
        Account acc1 = new BussinessAccount(1000, "luiz", 50d, 20d);
        Account acc2 = new SavingAccount(1000, "luiz", 50d, 0.1);
        Account acc3 = new Account(1000, "luiz", 50d);
        acc1.withdraw(20d);
        acc2.withdraw(20d);
        acc3.withdraw(20d);
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());

    }
}
