public class LabeledPoint {
    private int x;
    private int y;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint[x=" + x + ", y=" + y + ", label=" + label + "]";
    }

      public static void main(String[] args) {
               LabeledPoint point = new LabeledPoint(10, 20, "A");

               System.out.println(point);

        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());
        System.out.println("Label: " + point.getLabel());
    }
}
