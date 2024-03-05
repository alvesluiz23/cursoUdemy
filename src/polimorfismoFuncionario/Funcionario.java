package polimorfismoFuncionario;



public class Funcionario {
    protected String name;
    protected Double workedHours;
    protected Double valueWork;

    public  Funcionario(){

    }

    public Funcionario(String name, Double workedHours, Double valueWork){
        this.name = name;
        this.workedHours = workedHours;
        this.valueWork = valueWork;
    }

    public Double payment(){
        return workedHours*valueWork;
    }


    @Override
    public String toString() {
        return String.format("%s - $ %.2f", name, payment());
    }
}
