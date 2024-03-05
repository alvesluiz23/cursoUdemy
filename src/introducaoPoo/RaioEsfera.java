package introducaoPoo;

import java.util.Locale;
import java.util.Scanner;

public class RaioEsfera {
    public static final double PI = 3.14159;

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter with a radius ");
        double radius = scan.nextDouble();;

        double c = circuference(radius);
        double v = volume(radius);

        System.out.printf("Circuference %f\nVolumne: %f\nPI: %f", c,v, PI);

        scan.close();
    }

    public static double circuference(double radius){
        return 2.0*PI*radius;
    }

    public static double volume(double radius){
        return 4.0*radius*radius*PI/3.0;
    }

}
