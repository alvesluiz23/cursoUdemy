package comportamentoArrayListMemoria;


import java.util.Scanner;

class Quarto{
    private String nome;
    private String email;
    private int numeroQuarto;

    Quarto(String nome, String email, int numeroQuarto){
        this.nome = nome;
        this.email = email;
        this.numeroQuarto = numeroQuarto;
    }

    public String toString(){
        return "Quarto "+this.numeroQuarto+" Alugada para "+this.nome+" Email contato "+this.email;
    }
}
public class DesafioPensionato {
    public static void main(String[] args){
        Quarto[] quarto = new Quarto[3];
        Scanner scan = new Scanner(System.in);

        for(int i =0; i<3; i++){
            System.out.print("Entre com o nome do cliente: ");
            String nome = scan.next();
            System.out.print("Entre com o email do cliente: ");
            String email = scan.next();
            System.out.print("Entre com o numero do quarto desejado ");
            int numeroQuarto = scan.nextInt();
            while(quarto[numeroQuarto] != null){
                System.out.print("Quarto já ocupado, entre com outro ");
                numeroQuarto = scan.nextInt();
            }
            quarto[numeroQuarto] = new Quarto(nome, email, numeroQuarto);
        }

        for(int j =0; j<3; j++){
            System.out.println(quarto[j]);
        }
    }

}
