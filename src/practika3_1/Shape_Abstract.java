package practika3_1;

public abstract class Shape_Abstract {
    protected String color = "None";
    protected boolean filled = false;

    public Shape_Abstract() {
    }

    public Shape_Abstract(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape_Abstract{color='" + this.color + "', filled=" + this.filled + "}";
    }
}
