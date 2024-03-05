package polimorfismoFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolimorfismoFUncionario {
    public static void main(String[] args){
        int numberEmployee;
        String isOut, name;
        Double hours, value;
        Scanner scan = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();


        System.out.print("Enter the number of employees: ");
        numberEmployee = scan.nextInt();

        for(int i=0;i<numberEmployee;i++){
            System.out.print("Outsourced(Y/N): ");
            isOut = scan.next();
            System.out.print("Name: ");
            name = scan.next();
            System.out.print("Hours: ");
            hours = scan.nextDouble();
            System.out.print("Value: ");
            value = scan.nextDouble();
            if(isOut.equalsIgnoreCase("y")){
                funcionarios.add(new OutsourceFuncionario(name, hours, value));
            }else{
                funcionarios.add(new Funcionario(name, hours, value));
            }


        }
        for(Funcionario funcionario:funcionarios){
            System.out.println(funcionario);
        }

    }
}
