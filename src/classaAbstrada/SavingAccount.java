package classaAbstrada;



public final class SavingAccount extends Account {
    private Double interestRate;

    public SavingAccount(){
        super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate(){
        return  interestRate;
    }

    public void setInterestRate(Double rate){
        interestRate = rate;
    }

    public void updateBalance(){
        balance += balance*this.interestRate;
    }

    @Override
    public void withdraw(Double value){
        balance -= value;
    }
}
