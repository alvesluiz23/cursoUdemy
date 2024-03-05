package polimorfismoExercicioFixacao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        int numberProducts;
        String type, name, manufactureDate;
        Double price, customFee;

        System.out.print("Enter the number of products: ");
        numberProducts = scan.nextInt();


        for(int i=1; i<=numberProducts;i++){
            System.out.printf("Product %d data:\n", i);
            System.out.print("Common, used or imported (c/u/i): ");
            type = scan.next();
            System.out.print("Name: ");
            name = scan.next();
            System.out.print("Price: ");
            price = scan.nextDouble();
            if(type.equalsIgnoreCase("U")){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                manufactureDate = scan.next();
                products.add(new UsedProduct(name, price, manufactureDate));
            }
            else if(type.equalsIgnoreCase("i")){
                System.out.print("Custom fee: ");
                customFee = scan.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            }
            else{
                products.add(new Product(name, price));
            }


        }

        for(Product product: products){
            System.out.println(product);
        }


    }
}
