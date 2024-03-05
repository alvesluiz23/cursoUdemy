package ExercicioImposto;

public class PessoaFisica extends Pessoa{
    private Double healthBills;

    public PessoaFisica(String name, Double annualIncome, Double healthBills){
        super(name, annualIncome);
        this.healthBills = healthBills;
    }

    @Override
    public Double tax(){
        if(this.rendaAnual < 2000){
            return rendaAnual*0.15-healthBills*0.5;
        }
        else{
            return rendaAnual*0.25-healthBills*0.5;
        }
    }

    @Override
    public String toString(){
        return String.format("%s - %.2f", name, tax());
    }
}
