package classaAbstrada;



public class BussinessAccount extends Account {
    private Double loanLimit;

    public BussinessAccount(){

    }

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit(Double value){
        return loanLimit;
    }

    @Override
    public void withdraw(Double value) {
        super.withdraw(value);
        balance -= 20d;
    }

    public void loan(Double ammount){
        if(ammount <= loanLimit) deposit(ammount);
    }

}
