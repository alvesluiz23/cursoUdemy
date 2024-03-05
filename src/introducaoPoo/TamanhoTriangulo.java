package introducaoPoo;


import java.util.Scanner;

class Triangulo{
    private double x,y,z, area;
    Triangulo(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        area = calculateArea();
    }

    double calculateArea(){
        double p = (this.x+this.y+this.z)/2;
        return Math.sqrt(p*(p-this.x)*(p-this.y)*(p-this.z));
    }

    double getArea(){
        return area;
    }
}
public class TamanhoTriangulo {
    public static void main(String[] args){
        double x1,y1,z1,x2,y2,z2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the mensures of triangle 1");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        z1 = scan.nextDouble();
        System.out.println("Input the mensures of triangle 2");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        z2 = scan.nextDouble();
        Triangulo triangulo = new Triangulo(x1,y1,z1);
        Triangulo triangulo1 = new Triangulo(x2,y2,z2);

        System.out.printf("Triangle x area: %f\n", triangulo.getArea());
        System.out.printf("Triangle y area: %f\n", triangulo1.getArea());
    }

}
