package polimorfismoExercicioFixacao;

public class ImportedProduct extends Product{
    private Double customFee;
    public ImportedProduct(String name, Double price,Double customFee){
        super(name, price);
        this.customFee = customFee;
    }

    public String toString(){
        return String.format("%s (used) $ %.2f (Custom fee: $ %.2f", this.name, this.price, this.customFee);
    }

}
