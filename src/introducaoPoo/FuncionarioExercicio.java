package introducaoPoo;


import java.util.Scanner;

class Funcionario{
    private String nome;
    private double bruteSalary;
    private double tax;
    private double liquidSalary;

    Funcionario(String nome, double bruteSalary, double tax){
        this.nome = nome;
        this.bruteSalary = bruteSalary;
        this.tax = tax;
        System.out.println(this);
    }

    void increseSalary(double percentage){
        this.bruteSalary *= 1+(percentage/100);
        System.out.println(this);

    }


    public String toString(){
        return nome + " R$ "+String.format("%.2f", this.bruteSalary*(1-this.tax/100));
    }
}
public class FuncionarioExercicio {
    public static void main(String[] args){
        System.out.print("Name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.print("Gross salary: ");
        double grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        double tax = scan.nextDouble();

        Funcionario funcionario = new Funcionario(name, grossSalary, tax);

        double incresse = scan.nextDouble();

        funcionario.increseSalary(incresse);



    }

}
