package shapeArea;



public abstract class Shape {
    protected Color color;

    public Shape(){

    }

    public Shape(String color){
        this.color = Color.valueOf(color.toUpperCase());

    }

    public abstract Double area();
}
