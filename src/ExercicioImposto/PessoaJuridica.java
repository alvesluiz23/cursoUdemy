package ExercicioImposto;

public class PessoaJuridica extends Pessoa{
    private int numberEmployee;

    public PessoaJuridica(String name, Double annualIncome, int numberEmployee){
        super(name, annualIncome);
        this.numberEmployee = numberEmployee;
    }

    @Override
    public Double tax(){
        if(numberEmployee < 10){
            return rendaAnual*0.16;
        }else{
            return rendaAnual*0.14;
        }
    }

    public String toString(){
        return String.format("%s - %.2f", name, tax());
    }

}
