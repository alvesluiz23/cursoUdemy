package exercicioOrder;


import enumeracao.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        String name, email, birthDay, statusOrder;
        int orderItemsCount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        name = scan.next();
        System.out.print("Email: ");
        email = scan.next();
        System.out.print("Birthday (DD/MM/YY): ");
        birthDay = scan.next();
        System.out.println("Enter order data: ");
        System.out.print("STATUS: ");
        statusOrder = scan.next();
        Order order1 = new Order(name, email, birthDay, statusOrder);
        System.out.print("How many items to this order: ");
        orderItemsCount = scan.nextInt();


        String nameProduct;
        int quantityProduct;
        Double priceProduct;

        for(int i = 1; i<=orderItemsCount;i++){
            System.out.printf("Enter %d item data: \n",i);
            System.out.print("Product name: ");
            nameProduct = scan.next();
            System.out.print("quantity: ");
            quantityProduct = scan.nextInt();
            System.out.print("product price: ");
            priceProduct = scan.nextDouble();
            order1.addProduct(nameProduct, quantityProduct, priceProduct);
        }





        System.out.println(order1);
    }

}
