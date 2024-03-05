package polimorfismoExercicioFixacao;

public class Product {
    protected String name;
    protected   Double price;

    public Product(){

    }
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return String.format("%s $ %.2f", this.name, this.price);
    }

}
