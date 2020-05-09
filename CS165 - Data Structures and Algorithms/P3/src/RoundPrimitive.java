public class RoundPrimitive extends Primitive {
    private int x;
    private int y;
    private int width;
    private int height;

    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    public void draw(UserInterface ui){
        ui.lineColor(getColor());
        ui.fillColor(getColor());
        ui.drawOval(getX(), getY(),width, height, getisFilled());
    }

}
