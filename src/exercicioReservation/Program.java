package exercicioReservation;

import exercicioReservation.models.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Checkin: ");
            Date checkinDate = sdf.parse(sc.next());
            System.out.print("Checkout: ");
            Date checkoutDate = sdf.parse(sc.next());
            Reservation reservation = new Reservation(roomNumber, checkinDate, checkoutDate);
            System.out.print("Enter data to update reservation ");
            Date newCheckoutDate = sdf.parse(sc.next());
            reservation.dateCheckoutDate(newCheckoutDate);

            }
            catch (ParseException e){
                System.out.println("Invalid date format");
            }
            catch (DomainException e){
                System.out.println("Error "+e);
            }
        }

    }
