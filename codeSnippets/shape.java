public abstract class shape {
    public abstract double area();
    public String describe() { return "I'm a shape"; }
}

public class Circle extends shape{
    private final double radius;

    public Circle(double radius) { this.radius = radius;}

    @Override
    public double area() {return Math.PI * radius * radius;}
}