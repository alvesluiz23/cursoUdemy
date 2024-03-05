package exercicioReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.print("Checkin: ");
        Date checkinDate = sdf.parse(sc.next());
        System.out.print("Checkout: ");
        Date checkoutDate = sdf.parse(sc.next());

        if(checkinDate.after(checkoutDate)){
            System.out.println("Checkout date error: Chechout date must be after checkin");
        }
        else{
            Reservation reservation = new Reservation(roomNumber, checkinDate, checkoutDate);
            System.out.print("Enter data to update reservation ");
            Date newCheckoutDate = sdf.parse(sc.next());
            if(checkoutDate.after(newCheckoutDate )){
                System.out.println("New Checkout Chechout date must be after actually checkout");
            }else{
                reservation.updateCheckoutDate(checkoutDate);
                System.out.println(reservation);
            }
        }
    }
}