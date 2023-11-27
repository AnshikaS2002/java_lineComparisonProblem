public class LineComparison {
    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(4, 5);

        Line line = new Line();
        System.out.println("Length of line is " + line.findLength(p1, p2));
    }
}
