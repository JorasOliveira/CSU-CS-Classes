/**
 * Created by garethhalladay on 8/28/17
 */
abstract public class Primitive {

    private int size;
    private boolean Filled;
    private int Color;


    public boolean getFilled() {
        return Filled;
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



    public void setColor(int setColor) {
        this.Color = setColor;
    }
    public void setFilled(boolean filled) {
        Filled = filled;
    }
    public void setSize(int size) {
        this.size = size;
    }


    abstract void draw (UserInterface ui);
}
