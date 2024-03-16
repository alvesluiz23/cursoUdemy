package ExercicioFixacaoINterface;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Contract {
    private PaymentService paymentService;
    private double value;
    private int  installments;
    private LocalDate startDate;
    private double installmentsValue;

    public Contract(PaymentService paymentService, double value, int installments, LocalDate startDate){
        this.paymentService = paymentService;
        this.value = value;
        this.installments = installments;
        this.startDate = startDate;
        this.installmentsValue = value/installments;
    }

    @Override
    public String toString(){
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String result = "Parcelas: \n";
        for(int i=1;i<=installments;i++){
            result = result.concat(String.format("%s - %.2f \n", startDate.plusMonths(i).format(dtf),paymentService.calculatePayment(installmentsValue,i)));
        }
        return result;
    }

}
