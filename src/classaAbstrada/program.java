package classaAbstrada;


public class program {
    public static void main(String[] args){
       // Account acc1 = new Account(1007, "Luiz", 20d);
        Account acc2= new BussinessAccount(1007, "Luiz", 52d, 100d);
        Account acc3 = new SavingAccount(1007, "Luiz", 52d, 0.10);

    }
}
