public class Rectangle extends PolygonPrimitive{

    public Rectangle(int x, int y, int width, int height) {
        int[] xPoints = new int[]{x, x, x + width, x + width};
        int[] yPoints = new int[]{y, y + height, y + height, y};

        setxPoints(xPoints);
        setyPoints(yPoints);
    }
}
