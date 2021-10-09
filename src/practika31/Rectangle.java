package practika31;

public class Rectangle extends Shape_Abstract {
    protected double wight = 0.0D;
    protected double length = 0.0D;

    public Rectangle() {
    }

    public Rectangle(double wight, double length) {
        this.wight = wight;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double wight, double length) {
        super(color, filled);
        this.wight = wight;
        this.length = length;
    }

    public double getWight() {
        return this.wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return this.wight * this.length;
    }

    double getPerimeter() {
        return 2.0D * this.wight + 2.0D * this.length;
    }

    public String toString() {
        return "Rectangle{wight=" + this.wight + ", length=" + this.length + ", color='" + this.color + "', filled=" + this.filled + "}";
    }
}
