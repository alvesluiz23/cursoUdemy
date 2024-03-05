package composicao;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Worker worker = new Worker("Luiz", "JUNIOR", 5000.00, "TI");



        worker.addContract(new Date(2022,04,20), 20.00, 24);
        worker.addContract(new Date(2022,04,20), 120.00, 1);





        System.out.println(worker.income(new Date(2022,04,20)));


    }
}