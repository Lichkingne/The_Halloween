package practika31;

public class Circle extends Shape_Abstract {
    double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14D * Math.pow(this.radius, 2.0D);
    }

    double getPerimeter() {
        return 6.28D * this.radius;
    }

    public String toString() {
        return "Circle{radius=" + this.radius + ", color='" + this.color + "', filled=" + this.filled + "}";
    }
}
