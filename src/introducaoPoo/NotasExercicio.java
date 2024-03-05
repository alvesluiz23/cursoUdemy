package introducaoPoo;


import java.util.Scanner;

class Aluno{
    private double nota1, nota2, nota3, media;
    private String status;

    Aluno(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = calculateAvarage();
        System.out.print(this);
    }



    private double calculateAvarage(){
        return (this.nota1+this.nota2+this.nota3);
    }

    @Override
    public String toString() {
        String result = "FINAL GRADE = " + String.format("%.2f", media) + "\n";
        result += (media > 60)? "PASS" : "FAILED \nMISSING " + String.format("%.2f", 60-media);
        return  result;
    }
}
public class NotasExercicio {
    public static void main(String[] args){
        System.out.println("Entre com a primeira nota ");
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble();
        System.out.println("Entre com a segunda nota ");
        double nota2 = scan.nextDouble();
        System.out.println("Entre com a terceira nota ");
        double nota3 = scan.nextDouble();
        Aluno aluno = new Aluno(nota1, nota2, nota3);


    }
}
