package shapeArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int quant;
        List<Shape> shapes = new ArrayList<>();
        String typeShape, color;
        Double base, height, radius;
        System.out.print("Entre number of shapes do you want: ");
        quant = scan.nextInt();

        for(int i = 0;i<quant;i++){
            System.out.print("What type of shape do you want? ");
            typeShape = scan.next();
            if(typeShape.equalsIgnoreCase("c")){
                System.out.print("Enter circle radius: ");
                radius = scan.nextDouble();
                System.out.print("Enter circle color: ");
                color = scan.next();
                shapes.add(new Circle( color, radius));
            }
            if(typeShape.equalsIgnoreCase("r")){
                System.out.print("Enter retancle height: ");
                height = scan.nextDouble();
                System.out.print("Enter base height: ");
                base = scan.nextDouble();
                System.out.print("Enter circle color: ");
                color = scan.next();
                shapes.add(new Retancle(base,height, color));
            }
        }

        for(Shape shape: shapes){
            System.out.println(shape);
        }

    }

}
