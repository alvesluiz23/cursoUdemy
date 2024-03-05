package ExercicioImposto;

public abstract class Pessoa {
    protected String name;
    protected Double rendaAnual;

    public Pessoa(){}

    public Pessoa(String name, Double rendaAnual){
        this.name = name;
        this.rendaAnual = rendaAnual;

    }

    public abstract Double tax();

}
