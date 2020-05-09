public class Square extends PolygonPrimitive{

    public Square (int x, int y, int size){

        int[] xPoints = new int[]{x, x, x + size, x + size};
        int[] yPoints = new int[]{y, y + size, y + size, y};

        setxPoints(xPoints);
        setyPoints(yPoints);
    }
}
