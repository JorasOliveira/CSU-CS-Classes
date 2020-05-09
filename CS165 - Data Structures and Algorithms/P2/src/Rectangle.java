public class Rectangle extends Primitive{

    public Rectangle(int x, int y, int width, int height){
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    public void draw(UserInterface ui){
        ui.lineColor(getColor());
        ui.fillColor(getColor());
        ui.drawRectangle(getX(),getY(), getWidth(), getHeight(), getisFilled());
    }
}
