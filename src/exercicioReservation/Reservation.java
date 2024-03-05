package exercicioReservation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

public class Reservation {
    private int roomNumber;
    Date checkinDate,checkoutDate;

    public Reservation(int roomNumber, Date checkinDate, Date checkoutDate){
        this.roomNumber = roomNumber;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Reservation: room %d, check-in: %s. check-out: %s duration = %d\n", roomNumber, formatter.format(checkinDate), formatter.format(checkoutDate), duration());
    }
    public String updateCheckoutDate(Date checkoutDate){
        this.checkoutDate = checkoutDate;
    }

    public int duration(){
        long diff = checkoutDate.getTime()-checkinDate.getTime();
        return  (int) ((diff / (1000*60*60*24)));
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Reservation: room %d, check-in: %s. check-out: %s duration = %d", roomNumber, formatter.format(checkinDate), formatter.format(checkoutDate), duration());
    }
}
