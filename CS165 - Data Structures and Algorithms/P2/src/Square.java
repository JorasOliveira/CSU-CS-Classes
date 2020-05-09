public class Square extends Primitive{

    public Square (int x, int y, int size){
        setX(x);
        setY(y);
        setSize(size);
    }
    public void draw(UserInterface ui){
        ui.lineColor(getColor());
        ui.fillColor(getColor());
        ui.drawRectangle(getX(),getY(), getSize(), getSize(), getisFilled());
    }
}
