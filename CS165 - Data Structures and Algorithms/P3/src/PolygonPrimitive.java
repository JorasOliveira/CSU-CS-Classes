public class PolygonPrimitive extends Primitive {
    int[] xPoints = new int[7];
    int[] yPoints = new int[7];


    public void setyPoints(int[] yPoints) {
        this.yPoints = yPoints;
    }

    public void setxPoints(int[] xPoints) {
        this.xPoints = xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public void draw (UserInterface ui){
        ui.lineColor(getColor());
        ui.fillColor(getColor());
        ui.drawPolygon(xPoints,yPoints,getisFilled());
    }
}
