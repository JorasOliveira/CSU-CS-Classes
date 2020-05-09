public class Circle extends  RoundPrimitive{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius){
        setX(x);
        setY(y);
        setHeight(radius);
        setWidth(radius);
    }
}
