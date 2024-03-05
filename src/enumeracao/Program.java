package enumeracao;


import javax.management.OperationsException;
import java.util.Date;

public class Program {
    public static void main(String[] args){
        Order order = new Order(515, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.printf("os1 = %s \n", os1);
        System.out.printf("os2 = %s \n", os2);
    }
}
