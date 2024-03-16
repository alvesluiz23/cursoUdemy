package inter.model.service;

import inter.model.entitie.CarRental;
import inter.model.entitie.Invoice;

import java.time.Duration;

public class RentalService {

    private  TaxService brazilTaxService;
    private Double pricePerDay;
    private Double pricePerHour;


    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService){
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.brazilTaxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        Double hours = minutes/60;
        double basicPayPayment;
        if(hours <12){
            basicPayPayment = pricePerHour*Math.ceil(hours);

        }else{
            basicPayPayment = pricePerDay * Math.ceil(hours/24);
        }

        double tax = brazilTaxService.tax(basicPayPayment);
        carRental.setInvoice(new Invoice(basicPayPayment,tax));
    }


} 
