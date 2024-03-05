package polimorfismoExercicioFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class UsedProduct extends Product {
    private Date manufactureDate;
    SimpleDateFormat  formatter = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String name, Double price,String manufactureDate) throws ParseException {
        this.name = name;
        this.price = price;
        this.manufactureDate = formatter.parse(manufactureDate);
    }

    public String toString(){

        return String.format("%s (Used) $ %.2f (Manufacture date: %s)", this.name, this.price, formatter.format(this.manufactureDate));
    }
}
