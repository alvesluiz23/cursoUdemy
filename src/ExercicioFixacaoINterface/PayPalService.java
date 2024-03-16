package ExercicioFixacaoINterface;

public class PayPalService implements  PaymentService{

    @Override
    public double calculatePayment(double value, int month) {
        return (value+(value*0.01*month))*1.02;
    }


}
