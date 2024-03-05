package exercicioOrder;

public class OrderItem {
    private Integer quantity;


    private Product product;

    public OrderItem(Integer quantity, Double price,String nameProduct){
         this.quantity = quantity;
         product = new Product(nameProduct, price);
    }

    public String getNameProduct(){
        return product.getName();
    }

    public Double getPriceProduct(){
        return product.getPrice();
    }

    public Integer getQuantity(){return  quantity;};


    public Double subTotal(){
        return this.quantity*this.product.getPrice();
    }

}
