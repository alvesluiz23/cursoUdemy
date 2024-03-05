package heranca;

public class Program {
    public static void main(String[] args){
        Account acc = new Account(70, "Luiz", 20d);
        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0d, 400d);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BussinessAccount(70, "Ednaldo", 0d, 2500d);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.001);

        //Downcast
        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100d);
        //BussinessAccount acc5 = (BussinessAccount) acc3;
        if(acc3 instanceof BussinessAccount){
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(100d);
        }

        if(acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
