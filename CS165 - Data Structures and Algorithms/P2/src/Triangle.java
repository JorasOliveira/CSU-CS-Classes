public class Triangle extends Primitive {
    private int x0;
    private int y0;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY2() {
        return y2;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getX1() {
        return x1;
    }

    public int getY0() {
        return y0;
    }

    public int getX0() {
        return x0;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public Triangle(int x0, int y0, int x1, int y1, int x2, int y2){
        setX0(x0);
        setY0(y0);
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    public void draw(UserInterface ui){
        int[] xPos = new int[2];
        int[] yPos = new int[2];
        xPos[0] = getX0();
        xPos[1] = getX1();
        xPos[2] = getX2();
        yPos[0] = getY0();
        yPos[1] = getY1();
        yPos[2] = getY2();

        ui.lineColor(getColor());
        ui.fillColor(getColor());
        ui.drawPolygon(xPos, yPos, getisFilled());
    }
}
