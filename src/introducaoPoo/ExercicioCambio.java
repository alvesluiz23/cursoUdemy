package introducaoPoo;


import java.util.Locale;
import java.util.Scanner;

class CurrencyConverter{
    public static double calculate(double dollarCust, double dollarAmount){
        return (dollarCust*dollarAmount)*1.06;

    }

}
public class ExercicioCambio {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the dollar price ");
        double dollarPrice = scan.nextDouble();
        System.out.print("how many dollars will mbe bought? ");
        double dollarAmount = scan.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calculate(dollarPrice, dollarAmount));

    }
}
