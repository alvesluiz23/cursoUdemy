package shapeArea;

public class Retancle extends Shape{
    private Double base, height;

    public Retancle(Double base, Double height, String color){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public Double area(){
        return base*height;
    }

    @Override
    public String toString() {
        return String.format("Retancle %s base = %.2f hieght %.2f area %.2f", color, base, height, area());
    }
}
