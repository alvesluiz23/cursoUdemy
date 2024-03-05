package classaAbstrada;

public abstract class  Account {
    protected Integer number;
    protected String holder;
    protected Double balance;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double value){
        balance -= value+5;
    }

    public void deposit(Double value){
        balance += value;
    }
}
