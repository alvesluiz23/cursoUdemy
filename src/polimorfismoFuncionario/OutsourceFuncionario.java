package polimorfismoFuncionario;

public class OutsourceFuncionario extends Funcionario{

    public OutsourceFuncionario(String name, Double workedHours, Double valueWork){
        super(name,workedHours,valueWork);
    }

    @Override
    public Double payment(){
        return workedHours*valueWork+(workedHours*valueWork*1.10);
    }
}
