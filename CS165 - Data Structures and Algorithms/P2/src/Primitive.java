/**
 * Created by garethhalladay on 8/28/17
 */
public class Primitive {
    private int x;
    private int y;
    private int size;
    private boolean Filled;
    private int Color;
    private boolean setFilled;
    private int width;
    private int height;

    public boolean getFilled() {
        return setFilled;
    }
    public int getSize() {
        return size;
    }
    public int getColor() {
        return Color;
    }
    public boolean getisFilled() {
        return Filled;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    public void setsetFilled(boolean setFilled) {
        this.setFilled = setFilled;
    }
    public void setColor(int setColor) {
        this.Color = setColor;
    }
    public void setFilled(boolean filled) {
        Filled = filled;
    }
    public void setSize(int size) {
        this.size = size;
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
}
