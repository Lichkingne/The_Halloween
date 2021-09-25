package practica2;

public class lok {
    double x = 0.0;
    double y = 0.0;

    public lok(){

    }
    public lok(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y)
    {
        this.y = y;
        this.x = x;
    }
    public void Dvijenie(double xDistation,double yDistation)
    {
        this.x += xDistation;
        this.y += yDistation;
    }
    public String toString() {
        return "Ball_New (Коррдинаты) {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
