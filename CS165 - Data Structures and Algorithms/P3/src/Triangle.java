public class Triangle extends PolygonPrimitive {


    public Triangle(int x0, int y0, int x1, int y1, int x2, int y2){
        int[] xPoints = new int[]{x0, x1, x2};
        int[] yPoints = new int[]{y0, y1, y2};

        setxPoints(xPoints);
        setyPoints(yPoints);

    }
}
