package exercicioReservation;

import exercicioReservation.models.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

public class Reservation {
    private int roomNumber;
    Date checkinDate,checkoutDate;

    public Reservation(int roomNumber, Date checkinDate, Date checkoutDate) throws DomainException {
        this.roomNumber = roomNumber;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        if(!checkoutDate.after((checkinDate))){
            throw new DomainException("Checkout must be after checkin");
        }
        if(checkinDate.before(now) || checkoutDate.before(now) ){
            throw new DomainException("Dates must be futuren");
        }
        System.out.printf("Reservation: room %d, check-in: %s. check-out: %s duration = %d\n", roomNumber, formatter.format(checkinDate), formatter.format(checkoutDate), duration());
    }
    public void dateCheckoutDate(Date checkoutDate) throws DomainException {
        if(this.checkoutDate.after(checkoutDate)){
            throw new DomainException("Update chekout date must be after actual checkout date");
        }
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
