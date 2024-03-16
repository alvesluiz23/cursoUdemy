package ExercicioFixacaoINterface;

import javax.annotation.processing.SupportedSourceVersion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        PaymentService paymentService = new PayPalService();
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/mm/yyyy): ");
        LocalDate startDate = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(paymentService, value, installments, startDate);

        System.out.print(contract);

    }
}
