package exercicioOrder;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Order {
    private OrderStatus orderStatus;

    private Double totalPrice;
    private Date moment;
    private Client client;
    private List<OrderItem> items;
    
    public Order(String nomeCliente, String email, String birthDate, String statusOrder){

        orderStatus = OrderStatus.valueOf(statusOrder.toUpperCase());
        moment = new Date();
        client = new Client(nomeCliente, email, birthDate);
        items = new ArrayList<>();
        totalPrice = 0d;
        Scanner scan = new Scanner(System.in);
    }

    public void addProduct(String name,Integer quantity,Double price){
        items.add(new OrderItem(quantity, price, name));
        totalPrice += price*quantity;
    }


    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YY H:m:s");
        String orderInfosString = String.format("ORDER SUMMARY:\nOrder moment: %s\nOrder status: %s\nClient: %s\nOrder items: \n",simpleDateFormat.format(moment), this.orderStatus, this.client);
        String itemsListInfo = "";

        Iterator<OrderItem> iteratoritemsList = items.iterator();

        while (iteratoritemsList.hasNext()){
            OrderItem itemNext = iteratoritemsList.next();
            itemsListInfo = itemsListInfo.concat(String.format("%s, $%.2f, Quantity: %d, Subtotal: %.2f \n", itemNext.getNameProduct(), itemNext.getPriceProduct(), itemNext.getQuantity(), itemNext.subTotal()));
        }



        String concat1 = orderInfosString.concat(itemsListInfo);
        return concat1.concat(String.format("Total price: %.2f", this.totalPrice));

    }





}
