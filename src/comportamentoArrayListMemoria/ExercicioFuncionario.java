package comportamentoArrayListMemoria;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


class Funcionario{
    private String nome;
    private Integer id;
    private double salario;

    Funcionario(String nome, Integer id, double salario){
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public void increseSalary(double percentage){
        this.salario *= 1+percentage;
    }

    public String toString(){
        return this.id+" , "+this.nome+" . "+this.salario;
    }

    public Integer getId(){
        return this.id;
    }

}

public class ExercicioFuncionario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        String name;
        Integer id;
        double salario;


        for(int i = 1; i<=n; i++){
            System.out.printf("Employee #%d\n", i);
            System.out.println("Name: ");
            name = scan.next();
            System.out.println("Id: ");
            id = scan.nextInt();
            funcionarios.stream().filter(funcionario -> id.equals(funcionario.getId())).findAny().orElse(null);


            System.out.println("Salario: ");
            salario = scan.nextDouble();

            funcionarios.add(new Funcionario(name, id, salario));

            System.out.println("List of employees");
        }
        for(Funcionario f: funcionarios){
            System.out.println(f);
        }
    }
}
