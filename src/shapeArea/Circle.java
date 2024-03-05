package shapeArea;

public class Circle extends Shape{
    private Double radius;

    public Circle(String color, Double radius){
        super(color1);
        this.radius = radius;
    }

    @Override
    public Double area(){
        return radius*3.14*3.14;
    }


    @Override
    public String toString() {
        return String.format("Circle %s radiys = %.2f area %.2f", color, radius , area());
    }

}
