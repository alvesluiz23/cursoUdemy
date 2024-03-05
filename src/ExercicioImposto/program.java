package ExercicioImposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        List<Pessoa> pessoas = new ArrayList<>();
        int numberPessoas;
        String typePayer, name;
        Double anualIncome, healthExpenditures;
        Double totalTax = 0d;
        int numberEmployees;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        numberPessoas = scan.nextInt();

        for(int i=1; i<=numberPessoas; i++){
            System.out.printf("Tax payer #%d data: \n",i);
            System.out.print("Individual or company: ");
            typePayer = scan.next();
            System.out.print("Name: ");
            name = scan.next();
            System.out.print("Annual income: ");
            anualIncome = scan.nextDouble();
            if(typePayer.equalsIgnoreCase("i")){
                System.out.print("Health expenditures: ");
                healthExpenditures = scan.nextDouble();
                pessoas.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            }
            if(typePayer.equalsIgnoreCase("c")){
                System.out.print("Number of employees: ");
                numberEmployees = scan.nextInt();
                pessoas.add(new PessoaJuridica(name, anualIncome, numberEmployees));
            }


        }

        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa);
            totalTax += pessoa.tax();
        }

        System.out.printf("TOTAL TAX: $ %.2f", totalTax);
    }
}
