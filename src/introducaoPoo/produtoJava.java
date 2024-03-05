package introducaoPoo;


import java.util.Scanner;

class Product{
    private String name;
    private double price;
    private int quantity;

    Product(String name,double price,int quanttity){
        this.name = name;
        this.price = price;
        this.quantity = quanttity;
        System.out.println(toString());
    }

    Product(String name,double price){
        this.quantity = 0;
        this.name = name;
        this.price = price;
        System.out.println(toString());
    }

    public void addNew(int newQuantity){
        this.quantity += newQuantity;
        System.out.println(this);
    }

    public void removeProduct(int removeQuantity){
        if(removeQuantity >= this.quantity){
            this.quantity -= removeQuantity;
        }
        System.out.print(this);
    }

    public String toString(){
        return "Product "+this.name+" Quantity "+this.quantity+" Price R$"+this.price+" Total price "+this.price*this.quantity;
    }

}
public class produtoJava {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double price = scan.nextDouble();
        


        Product product = new Product(name, price);

        product.addNew(3);

    }

}
